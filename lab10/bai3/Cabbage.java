public class Cabbage implements Vegetable {

  private String type;
  private double weight;

  public Cabbage() {
    this.type = "VN";
    this.weight = 0.0;
  }

  public Cabbage(String type, double weight) {
    this.type = type;
    this.weight = weight;
  }

  public String getInfo() {
    return "Cabbage[" + type + ", " + weight + "]";
  }
}
