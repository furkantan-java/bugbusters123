package practice;

public class LogicalOperations {

    public static void main(String[] args) {
        boolean coffee = true;
        boolean tea = false;
        boolean milkshake = true;


        if ( coffee && tea  ){ //both of them should be true

            //single & operator : check both side even they are false
            //double && operator : check first one, if it is true than go and check second one
            System.out.println("Bring me coffee and tea");
        }

        if ( tea || milkshake  ){ //one of them should be true
            //single | operator : check both side even they are true
            //double || operator : check first one, if it is false than go and check second one
            System.out.println("Bring me tea or milkshake");
        }



    }

}
