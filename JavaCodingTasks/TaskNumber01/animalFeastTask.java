package TaskNumber01;

public class animalFeastTask {

    public static void main(String[] args) {

        String animal = "   Great blue heron "; // chickadee
        String dish = " Garlic    naan "; //chocolate cake
      //  System.out.println("Tast Result: "+checkValidAnimalFirstAndEndLettersOnTheDish(animal, dish));
    }

    public boolean checkValidAnimalFirstAndEndLettersOnTheDish(String animal, String dish){
        // first step remove any spaces in the values;
        String animalLetter = removeSpaceInStringValue(animal); //greatblueheron
        String dishLetter = removeSpaceInStringValue(dish);  // garlicnaan
        // second step checking length in the String values;
        if (animalLetter.length() <= 2)
            throw new Error("Animal letters must be at least 2 letters");
        else if (dishLetter.length() <= 2)
            throw new Error("Dish letters must be at least 2 letters");
        // third step checking any number in the String values;
        char[] arrayCharsAnimal = animalLetter.toCharArray();
        char[] arrayCharsDish = dishLetter.toCharArray();
        char getFirstLetterFromAnimalName = arrayCharsAnimal[0]; // g
        char getLastLetterFromAnimalName = arrayCharsAnimal[arrayCharsAnimal.length-1];  // n
        for(char a : arrayCharsAnimal) if(!Character.isLetter(a)) return false; // 1
        for(char b : arrayCharsDish) if(!Character.isLetter(b)) return false;
        // last step: validate first character and last character in both string equal or not;
        return getFirstLetterFromAnimalName == arrayCharsDish[0] && getLastLetterFromAnimalName == arrayCharsDish[arrayCharsDish.length-1];
    }

    public static String removeSpaceInStringValue(String value){
        String[] words = value.toLowerCase().trim().split(" ");  //greatblueheron
        String noWhiteSpaceValue = "";
        for (String each : words){
            noWhiteSpaceValue += each;
        }
        return noWhiteSpaceValue;
    }
}
