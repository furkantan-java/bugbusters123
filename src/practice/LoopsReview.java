package practice;

public class LoopsReview {
    public static void main(String[] args) {
        boolean condition = false;
        int a = 0;
        int b = 20;
//        if( condition ){
//            System.out.println("Condition is true");
//        } else {
//            System.out.println("Condition is false");
//        }
//
//
//        if( condition ){
//            System.out.println("Condition is true");
//        } else if ( condition == true  ) {
//            System.out.println("Condition is false");
//        } else {
//            System.out.println(" None of them");
//        }
        System.out.println("2 if statement");

        if ( a == 10 ) {
            System.out.println( " a is equal to 10");
        }
        if ( b == 20 ){
            System.out.println( "b is equal to 20 ");
        }


        System.out.println("if else if statement");

        if ( a == 10 ) {
            System.out.println( " a is equal to 10");
        } else if ( b == 20 ){
            System.out.println( "b is equal to 20 ");
        }

        System.out.println("if else statement");
        if ( a == 10 ) {
            System.out.println( " a is equal to 10");
        } else {
            System.out.println( "a is not equal to 10 ");
        }

        if ( a == 10 ) {
            System.out.println( "a is equal to 10");
        }

        if ( a != 10){
            System.out.println( "a is not equal to 10 ");
        }

        System.out.println("Nested if");
//        int a = 10;
//        int b = 20;
        if( a == 10){ //( a == 10 && b == 20)
            if ( b == 20 ){
                System.out.println("a is equal to 10 and b is equal to 20");
            }
            if ( b != 20){
                System.out.println("a is equal to 10 but b is not equal to 20");
            }
        }
//        int a = 0;
//        int b = 20;
        System.out.println("if else if statement");

        if ( a == 10 ) {
            System.out.println( "a is equal to 10");
        } else if ( b == 20 ){
            System.out.println( "b is equal to 20 ");
        } else {
            System.out.println( "none of them true");
        }


    }
}
