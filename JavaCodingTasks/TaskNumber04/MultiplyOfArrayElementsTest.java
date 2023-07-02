package TaskNumber04;

import TaskNumber03.CountNumberOfDuplicatedChars;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MultiplyOfArrayElementsTest {

    @Test
    void checkMultiplicationInArray01(){

        int[] inputValue = {2,3,4,5,6};
        int[] expectedResult = {6, 8, 15, 24, 30};
        int[] actualResult = MultiplyOfArrayElements.multiplyPreviousNextElementsArray(inputValue);
     //   Assertions.assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
      //  Assertions.assertArrayEquals(expectedResult, actualResult);
        Assertions.assertTrue(Arrays.equals(expectedResult, actualResult));
        // Arrays.deepEquals(expectedResult, actualResult); comparing dimentional array and objects

    }

    @Test
    void checkMultiplicationInArray02(){

        int[] inputValue = {2};
        int[] expectedResult = {2};
        int[] actualResult = MultiplyOfArrayElements.multiplyPreviousNextElementsArray(inputValue);
        //   Assertions.assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
        //  Assertions.assertArrayEquals(expectedResult, actualResult);
        Assertions.assertTrue(Arrays.equals(expectedResult, actualResult));
        // Arrays.deepEquals(expectedResult, actualResult); comparing dimentional array and objects

    }

    @Test
    void checkMultiplicationInArray03(){

        int[] inputValue = {2, 3};
        int[] expectedResult = {6 ,6};
        int[] actualResult = MultiplyOfArrayElements.multiplyPreviousNextElementsArray(inputValue);
        //   Assertions.assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
        //  Assertions.assertArrayEquals(expectedResult, actualResult);
        //  Assertions.assertThrows(() -> {} ); assert to exception
        // Arrays.deepEquals(expectedResult, actualResult); comparing dimentional array and objects

    }
}
