public class TaiKhoanVIP extends TaiKhoan{
    private int diemTichLuy;

    public TaiKhoanVIP(String tenDangNhap, String matKhau, String ngayTao, int diemTichLuy){
        super(tenDangNhap, matKhau, ngayTao);
        this.diemTichLuy = diemTichLuy;
    }

    public boolean congDiemThuong(int diemThuong){
        //code here
        if(diemThuong>0)
        {
            this.diemTichLuy= this.diemTichLuy+diemThuong;
            return true;
        }
        else
        {
            return false;
        }
    }

    public String toString(){
        return super.toString() + " - " + this.diemTichLuy;
    }
}