package TaskNumber01;

import org.junit.jupiter.api.Test;

class TestTest {

    @Test
    void checkValidationOfAnimalFeastTask(){
        String animal = "   Great blue heron "; // chickadee
        String dish = " Garlic    naan "; //chocolate cake
        animalFeastTask object01 = new animalFeastTask();
        object01.checkValidAnimalFirstAndEndLettersOnTheDish(animal, dish);
    }

    @Test
    void checkValidationOfFirstNonRepeatingVowel(){
        String value = "Google";
        firstNonRepeatingVowel object02 = new firstNonRepeatingVowel();
        object02.findFirstNonRepeatingVowel(value);
    }

}