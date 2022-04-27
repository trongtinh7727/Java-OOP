public class NongSan extends MatHang {
    private String loaiNongSan;

    public NongSan() {
        super();
        this.loaiNongSan = "";
    }

    public NongSan(String maMH, String tenMH, double giaMH, String loaiNongSang) {
        super(maMH, tenMH, giaMH);
        this.loaiNongSan = loaiNongSang;
    }

    public void setLoaiNongSan(String loaiNongSan) {
        this.loaiNongSan = loaiNongSan;
    }

    public String getLoaiNongSan() {
        return loaiNongSan;
    }

    public double tinhThue() {
        if (this.loaiNongSan.equals("Ca Chua") || this.loaiNongSan.equals("Bap Cai")) {
            return 0.1;
        }
        return 0.05;
    }

    @Override

    public double tinhGiaBan(int soLuong) {
        return super.tinhGiaBan(soLuong) + this.tinhThue() * super.tinhGiaBan(soLuong);
    }

    public double tinhKhuyenMai(int soLuong) {
        return 0.1 * this.tinhGiaBan(soLuong);
    }
}
