package day48;

public class HR_Action {
    public static void main(String[] args) {
        HourlyEmployee e1 = new HourlyEmployee("Subi", "101", 55, 2000);
        e1.calculateAnnualSalary();

        System.out.println("e1 = " + e1);

        HourlyEmployee e2 = new HourlyEmployee("Rok", "102", 57, 2000);
        e2.calculateAnnualSalary();

        System.out.println("e2 = " + e2);
    }
}
