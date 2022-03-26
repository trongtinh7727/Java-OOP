public class TestClub {
    public static void main(String[] args) {
        Club tinh = new Club("Tinh", 5, 5, 0);
        tinh.setWins(6);
        tinh.setDraws(1);
        tinh.setLosses(3);
        System.out.printf("%s\n",tinh.toString());
        System.out.printf("The club has finished the league: %b\n",tinh.isFinish());
        System.out.printf("Point: %d\n",tinh.getPoint());
    }
}
