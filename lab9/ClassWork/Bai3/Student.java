public abstract class Student {

  protected String sName;
  protected double gpa;

  public Student() {
    this.gpa = 0.0;
    this.sName = "";
  }

  public Student(String sName, double gpa) {
    this.sName = sName;
    this.gpa = gpa;
  }

  public double getGpa() {
    return gpa;
  }

  public String getsName() {
    return sName;
  }

  public void setGpa(double gpa) {
    this.gpa = gpa;
  }

  public void setsName(String sName) {
    this.sName = sName;
  }

  public abstract String getRank();

  @Override
  public String toString() {
    return String.format("Student[name: %s, gpa: %f]", this.sName, this.gpa);
  }
}
