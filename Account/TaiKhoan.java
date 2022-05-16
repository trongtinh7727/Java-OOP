public class TaiKhoan {

  protected String tenDangNhap;
  protected String matKhau;
  protected String ngayTao;

  public TaiKhoan(String tenDangNhap, String matKhau, String ngayTao) {
    //code here
    this.tenDangNhap = tenDangNhap;
    this.matKhau = matKhau;
    this.ngayTao = ngayTao;
  }

  public boolean doiMatKhau(String matKhauCu, String matKhauMoi) {
    //code here
    if (matKhauCu.equals(this.matKhau)) {
      this.matKhau = matKhauMoi;
      return true;
    } else {
      return false;
    }
  }

  public boolean kiemTraDangNhap(String matKhau) {
    //code here
    if (this.matKhau == matKhau) {
      return true;
    } else {
      return false;
    }
  }

  public String getTenDangNhap() {
    return this.tenDangNhap;
  }

  public String toString() {
    return this.tenDangNhap + " - " + this.matKhau;
  }
}
