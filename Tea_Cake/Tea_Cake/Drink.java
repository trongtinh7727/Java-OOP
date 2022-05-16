public class Drink extends Product {

  public Drink(String iID, String iName, double iPrice, double numberOf) {
    super(iID, iName, iPrice, numberOf);
  }

  public Drink(Drink p, double n) {
    super(p.prID, p.prName, p.prPrice, n);
  }

  @Override
  public double amount() {
    return numberOf * super.prPrice;
  }

  @Override
  public double tax() {
    return 0.05;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "Drink" + "_" + super.toString() + "_" + numberOf;
  }
}
