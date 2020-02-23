package day48;

public class HourlyEmployee extends Employee {
    int hourlyWage;
    int numsOfHours;
    String name;
    String id;

    public HourlyEmployee(String name, String id, int hourlyWage, int numsOfHours) {
        super(name, id);
        this.hourlyWage = hourlyWage;
        this.numsOfHours = numsOfHours;
    }

    public int getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(int hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public int getNumsOfHours() {
        return numsOfHours;
    }

    public void setNumsOfHours(int numsOfHours) {
        this.numsOfHours = numsOfHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void calculateAnnualSalary() {
        System.out.println("Yearly salary = " + (hourlyWage * numsOfHours));
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", numsOfHours=" + numsOfHours +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
