public class VegetableFactory {

  public Vegetable getVegetable(String type) {
    if (type == null) {
      return null;
    }
    if (type.equalsIgnoreCase("Carrot")) {
      return new Carrot();
    }
    if (type.equalsIgnoreCase("Cabbage")) {
      return new Cabbage();
    }
    if (type.equalsIgnoreCase("Pumpkin")) {
      return new Pumpkin();
    }
    return null;
  }
}
