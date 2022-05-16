public class Customer extends Person {

  private int point;
  private Bill bill = null;

  public Customer(String name, String ID, String address, int point) {
    super(name, ID, address);
    this.point = point;
  }

  public boolean addPoint(int new_point) {
    if (new_point > 0) {
      this.point = this.point + new_point;
      return true;
    }
    return false;
  }

  public Bill getBill() {
    return bill;
  }

  public void setBill(String bID) {
    this.bill = new Bill(bID);
  }

  public void printBill() {
    System.out.println(bill);
  }

  public double discount() {
    if (this.point >= 200) {
      return 0.2;
    } else if (this.point >= 100 && this.point < 200) {
      return 0.1;
    } else if (this.point >= 50 && this.point < 100) {
      return 0.05;
    } else {
      return 0;
    }
  }

  public double total() {
    return bill.sumOfAmount() * (1.0 - this.discount());
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString() + "_" + point;
  }
}
