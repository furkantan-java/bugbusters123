package day52;

public abstract class Human {

    String arm;
    String leg;
    String eyes;

    public Human(String arm, String leg, String eyes) {
        this.arm = arm;
        this.leg = leg;
        this.eyes = eyes;
    }

    public abstract void vucutSekli();
}
