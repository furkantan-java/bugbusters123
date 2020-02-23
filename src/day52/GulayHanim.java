package day52;

import java.util.Scanner;

public class GulayHanim extends Human {

    String memleket;

    public GulayHanim(String arm, String leg, String eyes) {
        super(arm, leg, eyes);
    }

    public GulayHanim(String arm, String leg, String eyes, String memleket) {
        super(arm, leg, eyes);
        this.memleket = memleket;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean a = scan.nextBoolean();
        System.out.println(a);
        Human bayan = new GulayHanim("20cm", "50cm","kahverengi", "Diyarbakır");
    }
    @Override
    public void vucutSekli() {

    }
}
