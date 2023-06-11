package TaskNumberOne;

public class firstNonRepeatingVowel {

    public static void main(String[] args) {

        String value = "Google";


        System.out.println(findFirstNonRepeatingVowel(value));

    }

    public static int findFirstNonRepeatingVowel(String target){

        char[] targetCharacters = target.toLowerCase().toCharArray();
        char[] vowelCharacters = {'a', 'e', 'i', 'o', 'u'};
        int currentIndex = -1;
        int firstVowelIndex = Integer.MAX_VALUE;

        for(char eachVowel : vowelCharacters) {
            int vowelCounter = 0;
            for(char eachCharacter : targetCharacters){
                if(eachVowel == eachCharacter){
                    vowelCounter++;
                }
            }
            if(vowelCounter == 1 ){
                 currentIndex = target.toLowerCase().indexOf(eachVowel);
                if( firstVowelIndex > currentIndex) {
                    firstVowelIndex = currentIndex;
                 }
                }
            }
        return firstVowelIndex > target.length()? -1 : firstVowelIndex;
        }
    }

