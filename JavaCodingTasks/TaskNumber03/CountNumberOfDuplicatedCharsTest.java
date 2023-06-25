package TaskNumber03;

import TaskNumber02.JadenCasingStrings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountNumberOfDuplicatedCharsTest {


    @Test
    void checkDuplicatedCharacterInString(){

        String actualResult = "abacdfb";
        String expectedResult = "2 # a and b";
        Assertions.assertEquals(expectedResult, CountNumberOfDuplicatedChars.countDuplicatedCharacters(
                actualResult));
    }
}
