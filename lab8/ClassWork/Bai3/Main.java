import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Student> findStudent(ArrayList<Student>lStudents){
        ArrayList<Student> res = new ArrayList<>();

        for (Student student : lStudents) {
            if (student.getRank().equals("A")| student.getRank().equals("Passed")) {
                res.add(student);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        ArrayList<Student> lStudents = new ArrayList<>();
        lStudents.add(new ITStudent("Tinh", 9.0, 7));
        lStudents.add(new ITStudent("Puc", 9.0, 1));
        lStudents.add(new ITStudent("Truc", 9.5, 4));
        lStudents.add(new ITStudent("Tien", 4.5, 3));
        lStudents.add(new MathStudent("Gam", 7, "A01"));
        lStudents.add(new MathStudent("Ngoc", 5, "A02"));
        lStudents.add(new MathStudent("Linh", 7, "A03"));
        ArrayList<Student> res = findStudent(lStudents);

        for (Student student : res) {
            System.out.println(student);
        }

    }
}
