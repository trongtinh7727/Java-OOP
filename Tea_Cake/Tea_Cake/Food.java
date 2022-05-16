public class Food extends Product {

  public Food(String iID, String iName, double iPrice, double numberOf) {
    super(iID, iName, iPrice, numberOf);
  }

  public Food(Food p, double n) {
    super(p.prID, p.prName, p.prPrice, n);
  }

  @Override
  public double amount() {
    return (double) numberOf * super.prPrice;
  }

  @Override
  public double tax() {
    return 0.045;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "Food" + "_" + super.toString() + "_" + numberOf;
  }
}
