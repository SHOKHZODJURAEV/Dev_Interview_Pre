package TaskNumberTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JadenCasingStringsTest {

    @Test
    void checkValidationJadenCasingStringTask(){

        String sentence = "     how can   mirrors    be real if    our eyes   aren't   real     ";
        JadenCasingStrings testObject = new JadenCasingStrings();
        System.out.println(testObject.jadenSmithWritingStyle(sentence));


    }

}