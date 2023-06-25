package TaskNumber03;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountNumberOfDuplicatedChars {

    public static void main(String[] args) {

        String userInput = "abacdfb";

        System.out.println(countDuplicatedCharacters(userInput));

    }

    public static String countDuplicatedCharacters(String input){
        if(input.isEmpty() || input == null) return null;

        char[] arrayCharacters = input.toLowerCase().trim().toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        String result = "";
        int count  = 0;
        for (char character : arrayCharacters) {
            if(map.containsKey(character)){

                map.put(character, map.get(character) + 1);
            }
            else {
                map.put(character, 1);
            }
        }

        for(Map.Entry<Character, Integer> entryMap : map.entrySet()){

            if(entryMap.getValue() > 1 ){
                count++;
                result += count == 1 ? " "+entryMap.getKey() : " and "+entryMap.getKey();
            }
        }
        return count + " #" + result;
    }
}
