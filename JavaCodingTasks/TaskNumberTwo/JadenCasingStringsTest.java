package TaskNumberTwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class JadenCasingStringsTest {

    @Test
    void checkValidationJadenCasingStringTask(){

        String actualResult = "     how can   mirrors    be real if    our eyes   aren't   real     ";
        String expectedResult = "How Can Mirrors Be Real If Our Eyes Aren't Real";
        Assertions.assertEquals(expectedResult, JadenCasingStrings.jadenSmithWritingStyle(actualResult));

    }
}