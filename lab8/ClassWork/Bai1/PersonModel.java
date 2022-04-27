import java.util.ArrayList;

public class PersonModel <T>{
    private ArrayList<T> al = new ArrayList<>();
    public void add(T obj){
        al.add(obj);
    }
    public void display(){
        for (T obj : al) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        PersonModel<Person> al = new PersonModel<>();
        //add 2 student
        al.add(new Student("tinh", 2003, "07", 10.0));
        al.add(new Student("truc", 2003, "01", 10.0));
        //add 2 employees
        al.add(new Employee("Puc", 2003, "E01", 5000));
        al.add(new Employee("Dung", 2003, "E02", 3000));
        //add 2 person
        al.add(new Person("Loc", 2003));
        al.add(new Person("Hung", 2003));
        al.display();
    }
}
