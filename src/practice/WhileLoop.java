package practice;

public class WhileLoop {

    public static void main(String[] args) {

        //part 1 : initialization , starting point, we just run it 1 time
        //part 2 : condition , check each loop if condition is true continue to looping
        //part 3 : update , we use this part for increment or decrement



        int point = 0; //part 1
        while ( point < 10 ){ // part 2 : condition comes after while word with parenthesis
            //until condition becomes false, Java will keep doing what you have inside your body
            System.out.println("Hello World");
            point++;//part3
        }


        System.out.println("Coffee Shop");
        boolean coffee = true; //11 cups of coffee
        System.out.println("coffee");
        int cups = 1; //part 1
        while ( cups <= 10 ){ // part 2 : condition comes after while word with parenthesis
            //until condition becomes false, Java will keep doing what you have inside your body
            System.out.println("coffee" + cups);
            cups++;//part3
        }



        //do while loop is using for if you need to do something at least once
        int glass = 1;//part 1
        do{
            System.out.println("coffee" + glass);
            glass++;//part 3
        } while ( glass <=10);//part 2






    }
}
