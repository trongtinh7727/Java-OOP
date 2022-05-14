public class Pumpkin implements Vegetable {

  private double weight;

  public Pumpkin() {
    this.weight = 0.0;
  }

  public Pumpkin(double weight) {
    this.weight = weight;
  }

  public String getInfo() {
    return "Pumpkin[" + weight + "]";
  }
}
