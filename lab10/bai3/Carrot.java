public class Carrot implements Vegetable {

  private String type;

  public Carrot() {
    this.type = "VN";
  }

  public Carrot(String type) {
    this.type = type;
  }

  public String getInfo() {
    return "Carrot[" + type + "]";
  }
}
