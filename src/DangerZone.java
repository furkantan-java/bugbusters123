import java.io.FileNotFoundException;
import java.io.IOException;

public class DangerZone {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("The Start");

            readMyFile();


        Thread.sleep(3000);

        System.out.println("The end");
    }

    public static void readMyFile()  {
        System.out.println("Reading the file in my computer");
        try {
            throw new FileNotFoundException("Kaboom! File is not here!!!");

        } catch (IOException e) {
            System.out.println("AHA!!! CAUGHT YOU IN READMYFILE");
        }
    }
}
