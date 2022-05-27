public class FullTimeStaff extends Staff {

  protected int baseSalary;
  protected double bonusRate;

  public FullTimeStaff(
    String sID,
    String sName,
    int baseSalary,
    double bonusRate
  ) {
    super(sID, sName);
    this.baseSalary = baseSalary;
    this.bonusRate = bonusRate;
  }

  public int getBaseSalary() {
    return baseSalary;
  }

  public void setBaseSalary(int baseSalary) {
    this.baseSalary = baseSalary;
  }

  public double getBonusRate() {
    return bonusRate;
  }

  public void setBonusRate(double bonusRate) {
    this.bonusRate = bonusRate;
  }

  @Override
  public double paySalary(int workingTime) {
    if (workingTime > 21) {
      return this.baseSalary * this.bonusRate + (workingTime - 21) * 100000.0;
    }
    return this.baseSalary * this.bonusRate;
  }

  @Override
  public String toString() {
    return super.toString() + "_" + bonusRate + "_" + baseSalary;
  }
}
