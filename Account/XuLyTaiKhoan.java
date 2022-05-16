public class XuLyTaiKhoan {

  private TaiKhoan tkDangXuLy;

  public XuLyTaiKhoan(String tenDangNhap, String matKhau) {
    QuanLyTaiKhoan qltk = new QuanLyTaiKhoan("DanhSachTaiKhoan.txt");
    tkDangXuLy = qltk.dangNhap(tenDangNhap, matKhau);
  }

  public boolean kiemTraDangNhap() {
    if (tkDangXuLy == null) {
      return false;
    }
    return true;
  }

  public boolean doiMatKhau(String matKhauCu, String matKhauMoi) {
    if (kiemTraDangNhap() == false) {
      return false;
    }
    tkDangXuLy.doiMatKhau(matKhauCu, matKhauMoi);
    return false;
  }

  public boolean congDiemThuong(int diemThuong) {
    if (kiemTraDangNhap() == false) {
      return false;
    }
    //code here
    return false;
  }

  public String inThongTin() {
    if (kiemTraDangNhap() == false) {
      return "Dang nhap that bai";
    }
    return tkDangXuLy.toString();
  }
}
