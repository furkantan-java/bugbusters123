import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class Deneme {


    public static void main(String[] args) {
        System.out.println(coverString("Certified Wooden Spoon", "o")); //java [me]thods
    }
    //main = "Certified Wooden Spoon";
//coverME = "o";
    public static String coverString(String main, String coverME) {
        if (main.contains(coverME)) {
            // We split main String by coverME String
            String[] arr = main.split(coverME);  //[Certified W, , den Sp, , n]
            //To see what we have in arr :
            System.out.println(Arrays.toString(arr));

            List<String>a1 = new ArrayList<>(Arrays.asList(main.split(" ")));
            System.out.println(a1.indexOf(1));
            a1 = null;

            System.out.println(a1);
            String newCoverME = "[" + coverME + "]"; // we change "o" to "[o]"
            String result = ""; //we will return result String
            //To get each index in arr we use fori, because we need to know
            //if we need to add coverME at the end of result String or not
            for (int i = 0 ; i<arr.length ; i++) {
                //if we are not at the last of arr
                //or if we have coverME at the end of main String (ex for: hello, ello)
                //add index and new coverME in result like this:
                //arr[0] = Certified W
                //coverME = [o]
                //result = Certified W + [o] = Certified W[o]
                // else just add index like this(this step is for last shot)
                // result = Certified W[o][o]den Sp[o][o] + n
                if ( i!=arr.length-1 || main.endsWith(coverME)) {
                    result = result + arr[i] + newCoverME;
                } else {
                    result = result + arr[i];
                }
            }
            //To seee what is inside result
            //System.out.println(result);
            result = result.trim();
            return result;
        } else {
            return ("[" + main + "]");
        }
        // one shot:
        //   if(main.contains(coverME))      return main = main.replace(coverME,"[" + coverME + "]");
        //   else       return( "[" + main  +"]" );
    }
}



