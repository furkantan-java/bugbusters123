package review;

import java.util.HashMap;
import java.util.Map;

public class mapppss {

    public static Map<String, Integer> getFrequencyMap(String str) {

        Map<String, Integer> wordFreqMap = new HashMap<>();
        String[] allWords = str.split(" ");

        for (String word : allWords) {
            if (!wordFreqMap.containsKey(word)) {
                wordFreqMap.put(word, 1);
            } else {
                // if we come to this point it means we already have the key and value
                // get old count value for the word
                Integer oldCount = wordFreqMap.get(word);
                // then replace it by incrementing by 1
                wordFreqMap.replace(word, oldCount + 1);
//                wordFreqMap.replace(word, wordFreqMap.get(word) + 1);
            }
        }
        return wordFreqMap;
    }
}
