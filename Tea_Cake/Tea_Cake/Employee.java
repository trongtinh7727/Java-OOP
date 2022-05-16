public class Employee extends Person {

  private String emDepartment;
  private double emSalary;
  private int emDayOff;
  private int emYearJoined;
  private Menu menu;

  public Employee(
    String name,
    String ID,
    String address,
    String emDepartment,
    int emYearJoined,
    double emSalary,
    int emDayOff
  ) {
    super(name, ID, address);
    this.emDepartment = emDepartment;
    this.emDayOff = emDayOff;
    this.emSalary = emSalary;
    this.emYearJoined = emYearJoined;
  }

  public double CalSalary(String Department, double Salary, int emYearJoined) {
    return 0;
  }

  public Menu getMenu() {
    return menu;
  }

  public void printMenu() {}

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
  }
}
