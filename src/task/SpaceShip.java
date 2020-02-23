package task;

import java.util.Arrays;

public class SpaceShip {
    String name;
    String currentDirection;
    int xCoordinate;
    int yCoordinate;

    public void initialPosition (int a , int b){
        xCoordinate = a;
        yCoordinate = b;
    }
    public void setDirection (String newDirection){
        if (newDirection.equalsIgnoreCase("up") || newDirection.equalsIgnoreCase("down") ||
                newDirection.equalsIgnoreCase("right") || newDirection.equalsIgnoreCase("left")){
        currentDirection = newDirection;}
    }

    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", currentDirection='" + currentDirection + '\'' +
                ", xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                '}';
    }

    public void move1Block (String abc){
        switch (abc){
            case "up":
                yCoordinate++;
                break;
            case "down":
                yCoordinate--;
                break;
            case "right":
                xCoordinate++;
                break;
            case "left":
                xCoordinate--;
                break;
        }
    }
}
