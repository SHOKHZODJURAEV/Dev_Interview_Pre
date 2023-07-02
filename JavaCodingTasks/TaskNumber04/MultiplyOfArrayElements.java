package TaskNumber04;

import java.util.Arrays;

public class MultiplyOfArrayElements {

    public static void main(String[] args) {

        int[] arr = {2,3}; //

        System.out.println(Arrays.toString(multiplyPreviousNextElementsArray(arr)));
    }
    public static int[] multiplyPreviousNextElementsArray(int[] array){ // {2,3,4,5,6}
        if(array == null){
            throw new IllegalArgumentException("Array can not be null value");
        }
        if(array.length <= 1)return array;
        int[] arrResult = new int[array.length]; // 5 {6,8,15,24,30}
        arrResult[0] = array[0] * array[1]; //2 * 3 = 6
        arrResult[array.length-1] = array[array.length-1] * array[array.length-2]; // 30
        for(int i = 1; i < array.length-1; i++ ){ // i = 2
            arrResult[i] = array[i-1] * array[i+1]; //2 * 4 = 8;
        }
        return arrResult;
    }
}
