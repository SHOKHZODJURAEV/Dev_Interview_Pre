package TaskNumberTwo;

import java.util.Locale;

public class JadenCasingStrings {

    public static void main(String[] args) {

        String sentance = "     how can   mirrors    be real if    our eyes   aren't   real     ";

        System.out.println(jadenSmithWritingStyle(sentance));
    }
    public static String jadenSmithWritingStyle(String words){
        if(words.isEmpty()) return null;
        String result =  "";
        String[] arrayWords = words.toLowerCase().trim().split(" ");
        for (String word : arrayWords){if (word.isEmpty()) continue;
           result += word.toUpperCase().charAt(0) + word.substring(1)+" ";
        }
        return result;
    }
}
