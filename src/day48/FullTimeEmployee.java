package day48;

public class FullTimeEmployee {
    String name;
    String id;
    int monthlySalary;

    public void calculateAnnualSalary(){

    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", monthlySalary=" + monthlySalary +
                '}';
    }
}
