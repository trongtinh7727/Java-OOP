public class TestHouse {
    public static void main(String[] args) {
        House canHo1 = new House();
        canHo1.setArea(100);
        canHo1.setHasSwimmingPool(true);
        canHo1.setCostPerSquareMeter(2500000);
        System.out.println(canHo1.toString());
    }
}
