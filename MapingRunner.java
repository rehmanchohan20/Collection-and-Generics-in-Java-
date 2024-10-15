import java.util.HashMap;
import java.util.Map;

public class MapingRunner {
    public static void main(String[] args) {
        // "This is a great thing"
// Looking the characters how many times they are being repeated. 
        String input = "This is a great thing";
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        System.out.println(charCountMap);


        // Looking the words how many times they are being repeated. 

        Map<String, Integer> stringOccurances = new HashMap<>();
            String [] words = input.split(" ");
            for(String word: words){
                Integer interger = stringOccurances.get(word);
                    if(interger == null){
                        stringOccurances.put(word,  1);
                    }else{
                        stringOccurances.put(word,  interger + 1);
                    }
            }
            System.out.println(stringOccurances);
    }
}
