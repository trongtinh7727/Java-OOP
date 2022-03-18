public class TestStudent {

    public static void main(String[] args) {
        Student tinh = new Student(52100852, "Vo", "Trong Tinh");
        tinh.setID(852);
        System.out.println(tinh.toString());
        System.out.printf("ID: %d\nName: %s", tinh.id, tinh.getName());
    }
}
