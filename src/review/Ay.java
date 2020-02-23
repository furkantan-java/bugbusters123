package review;

public class Ay {

    public static void main(String[] args) {

        /*1-Write a Java program to create a string in the form
        short_string + long_string + short_string from two strings.
                The strings must not have the same length.
                For example:
        Str1 = Java
        Str2 = Tutorial
        Str2 is longer than Str1 so
        Sample Output:
        JavaTutorialJava
         */
        String word1= "Mercedes";
        String word2= "Toyota";
        if(word1.length()<word2.length()){
            System.out.println(word1);
        }else if(word1.length()>word2.length()){
            System.out.println(word1+word2+word1);
        }
        /*2-Write a Java program to create
        the concatenation of the two strings
        except removing the first character of each string.
        For example:
        Str1 = Java
        Str2 = Tutorial
                (You should not get first letters when you concatinate them)
        Sample Output:
        avautorial*/
        String str1="Mumu";
        String str2="Koko";
        str1=str1.substring(0,1).replaceAll("M","")+str1.substring(1);
        str2= str2.substring(0,1).replaceAll("K","")+str2.substring(1);
        System.out.println(str1+str2 );
        /*3-Write a Java program
        to create a new string taking first three characters
        from a given string. If the length of the given string is less than 3
        use "#" as substitute characters.
                Example 1:
        Str1 = "Ayah"
        Output: Aya
        Example 2:
        Str2 = "su"
        (shorter than 3 so that)
        Output: ###
         */
        String name= "Zeynep";
        name=name.substring(0,3);
        if (name.length()<3){
            System.out.println("#");
        }else{
            System.out.println(name);
        }
        /*
        4- Write a Java program to create a new string
taking first and last characters from two given strings.
If the length of either string is 0 use "#" for missing character.
Example1: str1 = "Java"
str2 = ""
Output:
J#
Example2: str1 = "Ayah"
str2 = "Nur"
output:
AN
         */
        String first="Furkan";
        String last="Tan";
        first= first.substring(0,1);
        last= last.substring(0,1);
        //boolean first = first.substring(0,1);
        //boolean last = last.substring(0,1);
        if (first.length()==0 && last.length()==0  ) {
            System.out.println("#");
        }else {
            System.out.println(first+last);
        }
       /*
       5-Write a Java program to take the last three characters
from a given string and add the three characters
at both the front and back of the string.
String length must be greater than three and more.
For Example: "Java" will be "avaJavaava"
Output:
avaJavaava
For Example: "Ayjeren" will be "renAyjerenren"
output:
renAyjerenren
       */
        String school="Cybertek";
        String begining=school.substring(school.length()-3);
        String ending =school+ begining;
        System.out.println(begining+ending);

    }
}
