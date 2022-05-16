import java.util.ArrayList;

public class Bill implements PrAction {

  private String bID;
  private ArrayList<Product> lstProDucts = new ArrayList<>();

  public Bill(String bID) {
    this.bID = bID;
  }

  public String getbID() {
    return bID;
  }

  @Override
  public boolean addProduct(Product p) {
    Menu menu = Menu.getMenu();
    ArrayList<Product> lstPr = menu.getMenuList();
    String PrName = p.getPrName();
    double n = p.getNumberOf();

    for (Product i : lstPr) {
      if (i.getPrName().equalsIgnoreCase(PrName)) {
        if (i.getNumberOf() >= n) {
          lstProDucts.add(p);

          i.addNumberOf(-n);
        }
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean removeProduct(String prName) {
    for (Product product : lstProDucts) {
      // TODO Auto-generated method stub
      if (product.getPrName().equalsIgnoreCase(prName)) {
        lstProDucts.remove(product);
      }
    }
    return false;
  }

  public double sumOfAmount() {
    double sum = 0;
    for (Product product : lstProDucts) {
      sum += product.amount();
    }
    return sum;
  }

  @Override
  public String toString() {
    String billDetail = "ID: " + this.bID + "\n";
    for (Product product : lstProDucts) {
      billDetail += product.toString() + "\n";
    }
    return billDetail + "Sum of amount: " + this.sumOfAmount();
  }
}
