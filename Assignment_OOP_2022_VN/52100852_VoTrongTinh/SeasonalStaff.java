public class SeasonalStaff extends Staff {

  private int hourlyWage;

  public SeasonalStaff(String sID, String sName, int hourlyWage) {
    super(sID, sName);
    this.hourlyWage = hourlyWage;
  }

  public void setHourlyWage(int hourlyWage) {
    this.hourlyWage = hourlyWage;
  }

  public int getHourlyWage() {
    return hourlyWage;
  }

  @Override
  public double paySalary(int workingTime) {
    return hourlyWage * workingTime;
  }

  @Override
  public String toString() {
    return super.toString() + "_" + hourlyWage;
  }
}
