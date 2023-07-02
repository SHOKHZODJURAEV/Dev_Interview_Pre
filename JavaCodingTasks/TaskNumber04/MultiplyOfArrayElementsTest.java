package TaskNumber04;

import TaskNumber03.CountNumberOfDuplicatedChars;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MultiplyOfArrayElementsTest {

    @Test
    void checkMultiplicationInArray(){

        int[] actualResult = {2,3,4,5,6};
        int[] expectedResult = {6, 8, 15, 24, 30};
        Assertions.assertEquals(Arrays.toString(expectedResult), Arrays.toString(MultiplyOfArrayElements.multiplyPreviousNextElementsArray(actualResult)));
    }
}
