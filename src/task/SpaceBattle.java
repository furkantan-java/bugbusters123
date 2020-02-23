package task;

import java.util.Random;

public class SpaceBattle {
//    public static void main(String[] args) {
//        SpaceShip s1 = new SpaceShip();
//        s1.name = "Orville";
//        s1.initialPosition(1,5);
//        s1.setDirection("up");
        //s1.move1Block();

//        System.out.println(s1);

        public static void main(String[] args) {
            SpaceShip ship = new SpaceShip();
            ship.name = "Ghost";
            String[] directions = {"up", "down", "right", "left"};
            ship.initialPosition(1,5);
            Random rand = new Random();
            for (int i = 0; i < 10; i++) {
                int randNumber = Math.round(rand.nextInt(directions.length));
                ship.move1Block(directions[randNumber]);
                System.out.println(ship.toString());
            }
        }
    }