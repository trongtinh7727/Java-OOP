public abstract class Product {

  protected String prID;
  protected String prName;
  protected double prPrice;
  protected double numberOf;

  public Product(String prID, String prName, double prPrice, double numberOf) {
    this.numberOf = numberOf;
    this.prID = prID;
    this.prName = prName;
    this.prPrice = prPrice;
  }

  public Product(Product p) {
    this(p.prID, p.prName, p.prPrice, p.numberOf);
  }

  public double getPrPrice() {
    return prPrice;
  }

  public String getPrID() {
    return prID;
  }

  public String getPrName() {
    return prName;
  }

  public double getNumberOf() {
    return this.numberOf;
  }

  public void setNumberOf(double numberOf) {
    this.numberOf = numberOf;
  }

  public boolean addNumberOf(double n) {
    this.numberOf += n;
    if (numberOf < 0) {
      return false;
    }
    return true;
  }

  public abstract double amount();

  public abstract double tax();

  public String toString() {
    return prID + "_" + prName + "_" + prPrice;
  }
}
