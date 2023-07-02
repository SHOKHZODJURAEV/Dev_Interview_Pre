package TaskNumber04;

import java.util.Arrays;

public class MultiplyOfArrayElements {

    public static void main(String[] args) {

        int[] arr = {2,3,4,5,6};

        System.out.println(Arrays.toString(multiplyPreviousNextElementsArray(arr)));
    }
    public static int[] multiplyPreviousNextElementsArray(int[] array){
        if(array.length <= 1)return null;

        int[] arrResult = new int[array.length];
        arrResult[0] = array[0] * array[1];
        arrResult[array.length-1] = array[array.length-1] * array[array.length-2];
        for(int i = 1; i < array.length-1; i++ ){
            arrResult[i] = array[i-1] * array[i+1];
        }
        return arrResult;
    }


}
