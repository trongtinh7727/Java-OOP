public abstract class MatHang {
    private String maMH;
    private String tenMH;
    private double giaMH;

    public MatHang() {
        this.maMH = "";
        this.tenMH = "";
        this.giaMH = 0.0;
    }

    public MatHang(String maMH, String tenMH, double giaMH) {
        this.giaMH = giaMH;
        this.tenMH = tenMH;
        this.maMH = maMH;
    }

    public void setGiaMH(double giaMH) {
        this.giaMH = giaMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public double getGiaMH() {
        return giaMH;
    }

    public String getMaMH() {
        return maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public double tinhGiaBan(int soLuong) {
        return this.giaMH * soLuong;
    }

    public abstract double tinhKhuyenMai(int soLuong);

    public double tinhTongGiaBan(int soLuong) {
        return this.tinhGiaBan(soLuong) - this.tinhKhuyenMai(soLuong);
    }

}
