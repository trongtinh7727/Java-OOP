public class Manager extends FullTimeStaff {

  private int allowance;

  public Manager(
    String sID,
    String sName,
    int baseSalary,
    double bonusRate,
    int allowance
  ) {
    super(sID, sName, baseSalary, bonusRate);
    this.allowance = allowance;
  }

  public int getAllowance() {
    return allowance;
  }

  @Override
  public double paySalary(int workingTime) {
    return super.paySalary(workingTime) + allowance;
  }

  @Override
  public String toString() {
    return super.toString() + "_" + allowance;
  }
}
