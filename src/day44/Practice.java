package day44;

public class Practice {
    public static void main(String[] args) {
        CyberHouse.neighbourhoodName = "Lake Shadow";
        CyberHouse.showNeighborhood();
        CyberHouse house1 = new CyberHouse(10,"bungalov");
        CyberHouse house2 = new CyberHouse(11,"bungalov");
        CyberHouse house3 = new CyberHouse(12,"bungalov");
        CyberHouse house4 = new CyberHouse(13,"bungalov");
        house1.showAllInfo();
        house2.showAllInfo();
        house3.showAllInfo();
        house4.showAllInfo();

    }
}
