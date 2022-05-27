import java.io.*;
import java.util.*;

public class StoreManagement {

  private ArrayList<Staff> staffs;
  private ArrayList<String> workingTime;
  private ArrayList<Invoice> invoices;
  private ArrayList<InvoiceDetails> invoiceDetails;
  private ArrayList<Drink> drinks;

  public StoreManagement(
    String staffPath,
    String workingTimePath,
    String invoicesPath,
    String detailsPath,
    String drinksPath
  ) {
    this.staffs = loadStaffs(staffPath);
    this.workingTime = loadFile(workingTimePath);
    this.invoices = loadInvoices(invoicesPath);
    this.invoiceDetails = loadInvoicesDetails(detailsPath);
    this.drinks = loadDrinks(drinksPath);
  }

  public ArrayList<Staff> getStaffs() {
    return this.staffs;
  }

  public void setStaffs(ArrayList<Staff> staffs) {
    this.staffs = staffs;
  }

  public ArrayList<Drink> loadDrinks(String filePath) {
    ArrayList<Drink> drinksResult = new ArrayList<Drink>();
    ArrayList<String> drinks = loadFile(filePath);

    for (String drink : drinks) {
      String[] information = drink.split(",");
      drinksResult.add(
        new Drink(information[0], Integer.parseInt(information[1]))
      );
    }

    return drinksResult;
  }

  public ArrayList<Invoice> loadInvoices(String filePath) {
    ArrayList<Invoice> invoiceResult = new ArrayList<Invoice>();
    ArrayList<String> invoices = loadFile(filePath);

    for (String invoice : invoices) {
      String[] information = invoice.split(",");
      invoiceResult.add(
        new Invoice(information[0], information[1], information[2])
      );
    }

    return invoiceResult;
  }

  public ArrayList<InvoiceDetails> loadInvoicesDetails(String filePath) {
    ArrayList<InvoiceDetails> invoiceResult = new ArrayList<InvoiceDetails>();
    ArrayList<String> invoices = loadFile(filePath);

    for (String invoice : invoices) {
      String[] information = invoice.split(",");
      invoiceResult.add(
        new InvoiceDetails(
          information[0],
          information[1],
          Integer.parseInt(information[2])
        )
      );
    }

    return invoiceResult;
  }

  // requirement 1
  public ArrayList<Staff> loadStaffs(String filePath) {
    ArrayList<Staff> staffResult = new ArrayList<Staff>();
    ArrayList<String> staffs = loadFile(filePath);

    for (String staff : staffs) {
      String[] information = staff.split(",");
      if (information.length == 4) {
        staffResult.add(
          new FullTimeStaff(
            information[0],
            information[1],
            Integer.parseInt(information[2]),
            Double.parseDouble(information[3])
          )
        );
      } else if (information.length == 5) {
        staffResult.add(
          new Manager(
            information[0],
            information[1],
            Integer.parseInt(information[2]),
            Double.parseDouble(information[3]),
            Integer.parseInt(information[4])
          )
        );
      } else {
        staffResult.add(
          new SeasonalStaff(
            information[0],
            information[1],
            Integer.parseInt(information[2])
          )
        );
      }
    }

    return staffResult;
  }

  // requirement 2
  public ArrayList<SeasonalStaff> getTopFiveSeasonalStaffsHighSalary() {
    //code here and modify the return value
    ArrayList<Staff> seasonalList = new ArrayList<>();
    ArrayList<SeasonalStaff> res = new ArrayList<>();
    int rank = 0;
    for (Staff staff : staffs) {
      if (staff instanceof SeasonalStaff) {
        seasonalList.add((SeasonalStaff) staff);
      }
    }
    ArrayList<String[]> listSalary = calSalary(seasonalList);
    listSalary.sort(
      (
        (
          (o1, o2) ->
            -Double.compare(
              Double.parseDouble(o1[1]),
              Double.parseDouble(o2[1])
            )
        )
      )
    );
    for (String[] strings : listSalary) {
      for (Staff staff : seasonalList) {
        if (staff.getsID().equalsIgnoreCase(strings[0])) {
          res.add((SeasonalStaff) staff);
        }
      }
      rank++;
      if (rank == 5) {
        break;
      }
    }

    return res;
  }

  // requirement 3
  public ArrayList<FullTimeStaff> getFullTimeStaffsHaveSalaryGreaterThan(
    int lowerBound
  ) {
    //code here and modify the return value
    ArrayList<Staff> fulltimeList = new ArrayList<>();
    ArrayList<FullTimeStaff> res = new ArrayList<>();
    for (Staff staff : staffs) {
      if (staff instanceof FullTimeStaff) {
        fulltimeList.add((FullTimeStaff) staff);
      }
    }
    ArrayList<String[]> listSalary = calSalary(fulltimeList);
    for (Staff staff : fulltimeList) {
      for (String[] strings : listSalary) {
        if (staff.getsID().equalsIgnoreCase(strings[0])) {
          if (Double.parseDouble(strings[1]) > (double) lowerBound) {
            res.add((FullTimeStaff) staff);
          }
        }
      }
    }
    return res;
  }

  // requirement 4
  public double totalInQuarter(int quarter) {
    double total = 0;
    for (Invoice bill : invoices) {
      String[] data = bill.getDate().split("/");
      if (
        Integer.parseInt(data[1]) <= quarter * 3 &&
        Integer.parseInt(data[1]) > quarter * 3 - 3
      ) {
        for (InvoiceDetails billDetail : invoiceDetails) {
          if (billDetail.getInvoiceID().equalsIgnoreCase(bill.getInvoiceID())) {
            total += calInvoice(billDetail);
          }
        }
      }
    }
    // code here
    return total;
  }

  // requirement 5
  public Staff getStaffHighestBillInMonth(int month) {
    Staff maxStaff = null;
    ArrayList<String[]> staffBill = new ArrayList<>();

    for (Invoice bill : invoices) {
      String[] data = bill.getDate().split("/");
      if (Integer.parseInt(data[1]) == month) {
        boolean flag = true;
        for (String[] strings : staffBill) {
          if (bill.getStaffID().equalsIgnoreCase(strings[0])) {
            int amount = Integer.parseInt(strings[1]);
            for (InvoiceDetails billDetail : invoiceDetails) {
              if (
                billDetail.getInvoiceID().equalsIgnoreCase(bill.getInvoiceID())
              ) {
                amount += calInvoice(billDetail);
              }
            }
            strings[1] = Integer.toString(amount);
            flag = false;
            break;
          }
        }

        //chua co nv
        if (flag == true) {
          int amount = 0;
          for (InvoiceDetails billDetail : invoiceDetails) {
            if (
              billDetail.getInvoiceID().equalsIgnoreCase(bill.getInvoiceID())
            ) {
              amount += calInvoice(billDetail);
            }
          }
          staffBill.add(
            new String[] { bill.getStaffID(), Integer.toString(amount) }
          );
        }
      }
    }
    staffBill.sort(
      (
        (
          (o1, o2) ->
            -Integer.compare(Integer.parseInt(o1[1]), Integer.parseInt(o2[1]))
        )
      )
    );
    String[] strings = staffBill.get(0);
    for (Staff staff : staffs) {
      if (staff.getsID().equalsIgnoreCase(strings[0])) {
        maxStaff = staff;
        break;
      }
    }
    return maxStaff;
  }

  //calculate Salary
  public ArrayList<String[]> calSalary(ArrayList<Staff> stafflist) {
    ArrayList<String[]> listSalary = new ArrayList<>();
    for (String line : workingTime) {
      String[] timeTable = line.split(",");
      for (Staff staff : stafflist) {
        if (staff.getsID().equalsIgnoreCase(timeTable[0])) {
          double salary = staff.paySalary(Integer.parseInt(timeTable[1]));
          listSalary.add(
            new String[] { timeTable[0], Double.toString(salary) }
          );
        }
      }
    }
    return listSalary;
  }

  //calculate invoice
  public int calInvoice(InvoiceDetails bill) {
    int res = 0;
    for (Drink drink : drinks) {
      if (drink.getdName().equalsIgnoreCase(bill.getDName())) {
        res = bill.getAmount() * drink.getPrice();
      }
    }
    return res;
  }

  // load file as list
  public static ArrayList<String> loadFile(String filePath) {
    String data = "";
    ArrayList<String> list = new ArrayList<String>();

    try {
      FileReader reader = new FileReader(filePath);
      BufferedReader fReader = new BufferedReader(reader);

      while ((data = fReader.readLine()) != null) {
        list.add(data);
      }

      fReader.close();
      reader.close();
    } catch (Exception e) {
      System.out.println("Cannot load file");
    }
    return list;
  }

  public void displayStaffs() {
    for (Staff staff : this.staffs) {
      System.out.println(staff);
    }
  }

  public <E> boolean writeFile(String path, ArrayList<E> list) {
    try {
      FileWriter writer = new FileWriter(path);
      for (E tmp : list) {
        writer.write(tmp.toString());
        writer.write("\r\n");
      }

      writer.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("Error.");
      return false;
    }

    return true;
  }

  public <E> boolean writeFile(String path, E object) {
    try {
      FileWriter writer = new FileWriter(path);

      writer.write(object.toString());
      writer.close();

      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("Error.");
      return false;
    }

    return true;
  }
}
