package day59;

public class General {
    public static void main(String[] args) {
        System.out.println(" The Start ");
        String str = "";

        try {
            System.out.println(str.charAt(0));
            System.out.println("END OF TRY");
        } catch (NullPointerException bla){
            System.out.println("NO OBJECT HERE !!!!!");
        }
        catch (Exception e){
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            System.out.println("THIS IS THE REST OF EXCEPTIONS");
        }
        System.out.println(" THE END ");
    }
}
