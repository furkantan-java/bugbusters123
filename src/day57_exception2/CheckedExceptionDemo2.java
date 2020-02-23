package day57_exception2;

public class CheckedExceptionDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Checked Exception in next line");
            Thread.sleep(1000);
            System.out.println("after thread.sleep");
        }


    }

