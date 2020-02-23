package day52.books;

public class IfElsePractice {

    public static void main(String[] args) {
        int num = 100;

        if(num>90){
            System.out.println("AA");
        } else if (num>80){
            System.out.println("BB");
        } else if (num>70){
            System.out.println("CC");
        } else {
            System.out.println("DD");
        }

        System.out.println("----------------------------");

        if(num>60){
            System.out.println("DD");
        }
        if (num>70){
            System.out.println("CC");
        }
        if (num>80){
            System.out.println("BB");
        }
        if(num>90) {
            System.out.println("AA");
        }

        if( num >50){
            System.out.println("Greater than 50");
        } else {
            System.out.println("Lower than 50");
        }

        if( num >50){
            System.out.println("Greater than 50");
        }
        if (num<50){
            System.out.println("Lower than 50");
        }
    }
}
