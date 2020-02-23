package review;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String str = "Finding Words Frequency Sounds Fun Because Fun Comes in When you count Words" +
                " But How do I count the Words with what I already know previously " +
                "Do it and find out Words Words Words";
        String words [] = str.split(" ");
        int wordCount = words.length;
        System.out.println("wordCount = " + wordCount);
        Map<String,Integer> strList = new HashMap<>(); 
        for(String each : words){
            if(!strList.containsKey(each)){
                strList.put(each,1);
            } else {
                strList.replace(each,strList.get(each)+1);
            }
        }
        System.out.println("strList = " + strList);
    }
}
