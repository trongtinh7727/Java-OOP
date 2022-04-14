public class Manager extends Employee {
    private String position;
    private String department;
    private double salaryCoefficientPosition;

    public Manager() {
        super();
        this.position = "head of the office";
        this.department = "administrative";
        super.coefficientsSalary = 5.0;
    }

    public Manager(String ID, String fullName, double coefficientsSalary, String position,
            double salaryCoefficientPosition) {
        super(ID, fullName, coefficientsSalary);
        this.position = position;
        this.salaryCoefficientPosition = salaryCoefficientPosition;
        this.department = "administrative";
    }

    public Manager(String ID, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff,
            String position, String department, double salaryCoefficientPosition,double basicSalary) {
        super(ID, fullName, yearJoined, coefficientsSalary, numDaysOff,basicSalary);
        this.position = position;
        this.department = department;
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }

    public String getPosition(){
        return this.position;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public String getDepartment(){
        return this.department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public double getSalaryCoefficientPosition(){
        return this.salaryCoefficientPosition;
    }

    public void setSalaryCoefficientPosition(double salaryCoefficientPosition){
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }

    public String considerEmulation() {
        return "A";
    }

    public double bonusByPosition(){
        return super.basicSalary*this.salaryCoefficientPosition;
    }
    public double getSalary() {
        double ecoeffient = 1;
        return this.basicSalary + this.basicSalary * (this.coefficientsSalary + ecoeffient) + super.getSenioritySalary() + this.bonusByPosition();
    }

    public String toString(){
        return String.format("Manager[ID = %s, fullName = %s, coefficientsSalary = %.2f, position = %s, department = %s,salaryCoefficientPosition = %.2f]", super.ID,super.fullName,super.coefficientsSalary,this.position,this.department,this.salaryCoefficientPosition);
    }

}
