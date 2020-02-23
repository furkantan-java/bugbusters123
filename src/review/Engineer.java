package review;

public class Engineer {


    int salary;

    public Engineer(int salary, String name, int weight) {

        this.salary = salary;

    }

    public Engineer(){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "salary=" + salary +

                '}';
    }
}
