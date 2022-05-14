public class Main {

  public static void main(String[] args) {
    VegetableFactory vgtFactory = new VegetableFactory();
    Vegetable cr = vgtFactory.getVegetable("Carrot");
    System.out.println(cr.getInfo());
    Vegetable cb = vgtFactory.getVegetable("Cabbage");
    System.out.println(cb.getInfo());
    Vegetable pk = vgtFactory.getVegetable("Pumpkin");
    System.out.println(pk.getInfo());
  }
}
