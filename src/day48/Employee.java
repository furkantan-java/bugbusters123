package day48;

public abstract class Employee {
    String name;
    String id;


    public Employee(String name, String id){

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

    public abstract void calculateAnnualSalary();
    public abstract String toString();
}
