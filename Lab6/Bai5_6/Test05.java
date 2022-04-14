public class Test05 {
    public static void main(String[] args) {
        Employee tinh = new Employee("01", "Vo Trong Tinh", 2022, 3.0, 0,1150) ;
        System.out.println(tinh.toString());
        tinh.setYearJoined(2016);
        System.out.printf("Seniority salary: %.2f\nSalary: %.2f\n",tinh.getSenioritySalary(),tinh.getSalary());
        tinh.setYearJoined(2016);
        
        System.out.println();
        Manager puc = new Manager("02", "Puc Le", 3.0, "leader", 5.0);
        System.out.println(puc.toString());
        puc.setYearJoined(2016);
        System.out.printf("Seniority salary: %.2f\nSalary: %.2f\nbonus: %.2f\n",puc.getSenioritySalary(),puc.getSalary(),puc.bonusByPosition());
        
    }
}
