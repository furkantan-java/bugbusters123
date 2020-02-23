package task;

public class Pet {
    private String name;
    private String type;

    public Pet(){
        this.type = "unknown";
        this.name = "noname";
    }
    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void speak(){
        switch (type){
            case "cat":
                System.out.println("meow");
                break;
            case "dog":
                System.out.println("woof");
                break;
            case "cow":
                System.out.println("mooo");
                break;
            case "horse":
                System.out.println("neinei");
                break;
        }
    }
}
