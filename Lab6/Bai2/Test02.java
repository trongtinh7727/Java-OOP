public class Test02 {
    public static void main(String[] args) {
        Student tinh = new Student("Vo Trong Tinh", "Xuan Loc, Dong Nai", "Tieu chuan", 1, 24000000);
        tinh.setYear(2);
        System.out.println(tinh.getName());
        System.out.println(tinh.toString());
        System.out.println("Staff:");

        Staff tdt = new Staff("Puc Le", "Q7, TP Ho Chi Minh", "Ton Duc Thang", 130000);
        System.out.println(tdt.toString());
    }
}
