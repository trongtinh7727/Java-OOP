import java.io.*;
import java.util.*;

public class HoaDon {

  private ArrayList<SanPham> dsSanPham;

  public HoaDon(String path) {
    dsSanPham = docDSSanPham(path);
  }

  public ArrayList<SanPham> docDSSanPham(String path) {
    String line;
    String[] data;
    ArrayList<SanPham> temp = new ArrayList<>();
    //input
    try {
      File in = new File(path);
      Scanner sc = new Scanner(in);
      while (sc.hasNextLine()) {
        line = sc.nextLine();
        data = line.split(",");
        if (data[0].charAt(0) == 'T') {
          temp.add(
            new TraiCay(
              data[0],
              data[1],
              "kg",
              Double.parseDouble(data[2]),
              Double.parseDouble(data[3])
            )
          );
        } else {
          temp.add(
            new BanhMut(
              data[0],
              data[1],
              "hop",
              Double.parseDouble(data[2]),
              Integer.parseInt(data[3])
            )
          );
        }
      }
      sc.close();
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
      e.printStackTrace();
    }
    return temp;
  }

  private String layDonViTinh(String maSP) {
    //code here;
    for (SanPham sanPham : dsSanPham) {
      if (sanPham.getMaSanPham().equals(maSP)) {
        return sanPham.getDonViTinh();
      }
    }
    return "";
  }

  public double tinhTongGiaTriHoaDon() {
    double sum = 0.0;
    for (SanPham sanPham : dsSanPham) {
      sum += sanPham.thanhTien() + sanPham.thanhTien() * sanPham.tinhThue();
    }
    return sum;
  }

  public void inThongTinSanPham() {
    if (dsSanPham == null) {
      System.out.println("Khong co san pham");
      return;
    }
    for (SanPham s : dsSanPham) {
      System.out.println(s);
    }
  }
}
