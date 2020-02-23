package day63;

import java.util.HashMap;
import java.util.Map;

public class StringGroceryMap {
    public static void main(String[] args) {
        String str = "AAAAAABBBBBBCCRDDDD";

        Map<Character, Integer> charFreq = new HashMap<>();

//        for (int i = 0; i < str.length(); i++) {
//            if (charFreq.containsKey(str.charAt(i))) {
//                continue;
//            }
//            int count = 0;
//            for (int j = 0; j < str.length(); j++) {
//                if (str.charAt(i) == str.charAt(j)) {
//                    count++;
//                }
//            }
//            charFreq.put(str.charAt(i), count);
//        }

        for (Character each : str.toCharArray()) {
            if(!charFreq.containsKey(each)){
                charFreq.put(each,1);
            }else{
                charFreq.replace(each,charFreq.get(each)+1);
            }
        }
        System.out.println("charFreq = " + charFreq);
    }
}
