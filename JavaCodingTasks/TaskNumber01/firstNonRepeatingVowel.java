package TaskNumber01;

public class firstNonRepeatingVowel {

    public static void main(String[] args) {

        String value = "Google";


         //System.out.println(findFirstNonRepeatingVowel(value));

    }

    public int findFirstNonRepeatingVowel(String target){
        // first step make string to lowercase and store to char array
        char[] targetCharacters = target.toLowerCase().toCharArray();
        char[] vowelCharacters = {'a', 'e', 'i', 'o', 'u'};
        int currentIndex = -1;
        int firstVowelIndex = Integer.MAX_VALUE;
        // second step iterate each vowel character to target char array value
        for(char eachVowel : vowelCharacters) {
            int vowelCounter = 0;
            for(char eachCharacter : targetCharacters){
                if(eachVowel == eachCharacter){
                    vowelCounter++;
                }
            }
            // third step defining only one vowel character in target char array value
            if(vowelCounter == 1 ){
                 currentIndex = target.toLowerCase().indexOf(eachVowel);
                 // fourth find out first vowel character in the target String value
                if( firstVowelIndex > currentIndex) {
                    firstVowelIndex = currentIndex;
                 }
                }
            }
        // return first vowel or -1 if there is not any unique vowel character;
        return firstVowelIndex > target.length()? -1 : firstVowelIndex;
        }
    }

