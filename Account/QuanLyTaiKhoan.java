import java.io.*;
import java.util.*;

public class QuanLyTaiKhoan {

  private ArrayList<TaiKhoan> tkList;

  public QuanLyTaiKhoan(String path) {
    this.tkList = docDanhSachTaiKhoan(path);
  }

  public ArrayList<TaiKhoan> docDanhSachTaiKhoan(String path) {
    ArrayList<TaiKhoan> temp = new ArrayList<>();
    String line;
    String[] data;
    //code here
    try {
      File in = new File(path);
      Scanner sc = new Scanner(in);
      while (sc.hasNextLine()) {
        line = sc.nextLine();
        data = line.split(",");
        temp.add(new TaiKhoan(data[0], data[1], data[2]));
      }
    } catch (FileNotFoundException e) {
      System.out.println("Had error");
      e.printStackTrace();
    }
    return temp;
  }

  public TaiKhoan dangNhap(String tenDangNhap, String matKhau) {
    //code here
    for (TaiKhoan taiKhoan : tkList) {
      if (taiKhoan.getTenDangNhap().equals(tenDangNhap)) {
        if (taiKhoan.matKhau.equals(matKhau)) {
          return taiKhoan;
        }
      }
    }
    return null;
  }
}
