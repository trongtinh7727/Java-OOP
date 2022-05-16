public class TraiCay extends SanPham {

  private double soLuong;

  public TraiCay(
    String maSanPham,
    String tenSanPham,
    String donViTinh,
    double giaTien,
    double soLuong
  ) {
    super(maSanPham, tenSanPham, donViTinh, giaTien);
    this.soLuong = soLuong;
  }

  public double thanhTien() {
    return this.soLuong * this.giaTien;
  }

  public double tinhThue() {
    return 0.05;
  }

  public String toString() {
    return super.toString() + "_" + soLuong;
  }
}
