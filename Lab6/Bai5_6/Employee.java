import java.util.Calendar;

public class Employee {
    protected String ID;
    protected String fullName;
    protected int yearJoined;
    protected double coefficientsSalary;
    protected int numDaysOff;
    protected double basicSalary = 1150;

    public Employee() {
        this.ID = "0";
        this.fullName = "";
        this.yearJoined = 2020;
        this.coefficientsSalary = 1.0;
        this.numDaysOff = 0;
        this.basicSalary = 1150;
    }

    public Employee(String ID, String fullName, double coefficientsSalary) {
        this.ID = ID;
        this.fullName = fullName;
        this.yearJoined = 2020;
        this.coefficientsSalary = coefficientsSalary;
        this.numDaysOff = 0;
        this.basicSalary = 1150;
    }

    public Employee(String ID, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff, double basicSalary) {
        this.ID = ID;
        this.fullName = fullName;
        this.yearJoined = yearJoined;
        this.coefficientsSalary = coefficientsSalary;
        this.numDaysOff = numDaysOff;
        this.basicSalary = basicSalary;
    }


    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearJoined() {
        return this.yearJoined;
    }

    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }

    public double getCoefficientsSalary() {
        return this.coefficientsSalary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public int getNumDaysOff() {
        return this.numDaysOff;
    }

    public void setNumDaysOff(int numDaysOff) {
        this.numDaysOff = numDaysOff;
    }

    public double getBasicSalary(){
        return this.basicSalary;
    }

    public void setBasicSalary(double basicSalary){
        this.basicSalary = basicSalary;
    }

    public double getSenioritySalary() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if (currentYear - this.yearJoined >= 5) {
            return (currentYear - this.yearJoined) * this.basicSalary / 100.0;
        }
        return 0;
    }

    public String considerEmulation() {
        if (this.numDaysOff > 3) {
            return "C";
        }
        if (this.numDaysOff >= 2) {
            return "B";
        }
        return "A";
    }

    public double getSalary() {
        double ecoeffient = 0;
        switch (this.considerEmulation()) {
            case "A":
                ecoeffient = 1.0;
                break;
            case "B":
                ecoeffient = 0.75;
                break;
            case "C":
                ecoeffient = 0.5;
                break;
            default:
                break;
        }
        return this.basicSalary + this.basicSalary * (this.coefficientsSalary + ecoeffient) + this.getSenioritySalary();
    }

    public String toString(){
        return String.format("Employee[ID = %s, fullName = %s, yearJoined = %d, coefficientsSalary = %.2f, numDaysOff = %d]", this.ID,this.fullName,this.yearJoined,this.coefficientsSalary,this.numDaysOff);
    }
}