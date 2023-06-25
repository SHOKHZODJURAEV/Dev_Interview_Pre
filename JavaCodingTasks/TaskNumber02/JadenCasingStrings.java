package TaskNumber02;

public class JadenCasingStrings {

    public static void main(String[] args) {

        String sentence = null;

        System.out.println(jadenSmithWritingStyle(sentence));
    }
    public static String jadenSmithWritingStyle(String words){
        try {
            if (words.isEmpty()) return null;
            // StringBuilder result = new StringBuilder();
            String result = "";
            String[] arrayWords = words.toLowerCase().trim().split(" ");
            for (String word : arrayWords) {
                if (word.isEmpty()) continue;
                //result.append(word.toUpperCase().charAt(0)).append(word.substring(1)).append(" ");
                result += word.toUpperCase().charAt(0) + word.substring(1) + " ";
            }
            //return result.toString().trim();
            return result.trim();
        }catch(NullPointerException e){
            return  "NullPointer Exception";
        }
    }
}
