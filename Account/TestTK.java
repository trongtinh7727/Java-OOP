public class TestTK{
    public static void main(String[] args){
        XuLyTaiKhoan xltk = new XuLyTaiKhoan("truongvietanh","vat&111");
        System.out.println(xltk.inThongTin());
        xltk.doiMatKhau("vat&111","tvanh222");
        System.out.println(xltk.inThongTin());
        xltk.congDiemThuong(100);
        System.out.println(xltk.inThongTin());

        XuLyTaiKhoan xltk1 = new XuLyTaiKhoan("nguyenvanan","a1@123");
        System.out.println(xltk1.inThongTin());

        xltk1 = new XuLyTaiKhoan("nguyenvanan","a@123");
        System.out.println(xltk1.inThongTin());
        xltk1.doiMatKhau("a@123","123");
        System.out.println(xltk1.inThongTin());
        
    }
}