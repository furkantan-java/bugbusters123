package day44;

public class CyberHouse {
//    CyberHouse
//    instance fields : houseNum, design
//    static field : neighbourhoodName
//    add 2 args constructor
//    to set the houseNum, design
//    instance method
//    void showAllInfo()
//    just print the houseNum, design neighbourhoodName in one line
//    static void method showNeighborhood
//    print the neighbourhoodName only
    // try to access houseNum, design and see what happen
    private int houseNum;
    private String design;
    public static String neighbourhoodName;


    public CyberHouse(int houseNum, String design) {
        this.houseNum = houseNum;
        this.design = design;
    }

    public void showAllInfo(){
        System.out.println(houseNum + " " + design + " " + neighbourhoodName);
    }

    public static void showNeighborhood(){
        System.out.println("neighbourhoodName = " + neighbourhoodName);
    }

    @Override
    public String toString() {
        return "CyberHouse{" +
                "houseNum=" + houseNum +
                ", design='" + design + '\'' +
                '}';
    }
}
