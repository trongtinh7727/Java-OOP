public class Employee extends Person {
    private String id;
    private double salary;

    public Employee() {
        super();
        this.id = "";
        this.salary = 0.0;
    }

    public Employee(String name, int birth_year, String id, double salary) {
        super(name, birth_year);
        this.id = id;
        this.salary = salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Employee[name: %s, birth: %d, id: %s, salary: %f]", name,birth_year,id,salary);
    }
}
