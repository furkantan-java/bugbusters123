package day59;

public class ThrowingExceptionProgrammatically  {

    public static void main(String[] args) {
        NullPointerException e1 = new NullPointerException();
        NullPointerException e2 = new NullPointerException("Back to earth");
        System.out.println(e2);
        throw new NullPointerException("Furkan");
    }
}
