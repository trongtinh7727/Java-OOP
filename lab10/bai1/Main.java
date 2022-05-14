class Student {

  private String name;
  private String address;
  private String sex;
  private double score;

  public Student(String name, String address, String sex, double score) {
    this.name = name;
    this.address = address;
    this.sex = sex;
    this.score = score;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setScore(double score) {
    this.score = score;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getAddress() {
    return address;
  }

  public String getName() {
    return name;
  }

  public double getScore() {
    return score;
  }

  public String getSex() {
    return sex;
  }

  class StudentOperator {

    public void print() {
      System.out.printf(
        "Student [%s, %s, %s, %.2f]",
        name,
        address,
        sex,
        score
      );
    }

    public char type() {
      if (score > 8) {
        return 'A';
      } else if (score >= 5) {
        return 'B';
      }
      return 'C';
    }
  }
}

public class Main {

  public static void main(String[] args) {
    Student tinh = new Student("Vo Trong Tinh", "Q3", "Nam", 9.5);
    Student.StudentOperator studentOperator = tinh.new StudentOperator();
    studentOperator.print();
    System.out.printf("\nRank: %c", studentOperator.type());
  }
}
