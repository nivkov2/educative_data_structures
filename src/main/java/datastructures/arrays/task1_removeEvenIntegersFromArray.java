package datastructures.arrays;

import java.util.Arrays;

public class task1_removeEvenIntegersFromArray {
    /*
        In this problem, you have to implement the int [] removeEven(int[] arr) function,
         which removes all the even elements from the array and returns back updated array.

        Function Prototype #
                                int[] removeEven(int[] arr);
        Sample Input #
                                arr = {1, 2, 4, 5, 10, 6, 3}
        Sample Output #
                                arr = {1, 5, 3}
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
    // test removeEven function
        Arrays
            .stream(removeEven(array))
            .forEach(System.out::println);
    //test removeEvenViaStreamApi function
        Arrays
                .stream(removeEvenViaStreamApi(array))
                .forEach(System.out::println);
    }

    private static int[] removeEvenViaStreamApi(int[] arr){
        return Arrays
                .stream(arr)
                .filter( i -> i % 2 != 0)
                .toArray();
    }

    private static int[] removeEven(int[] arr){
        int count = 0;

        //count all non even elements in the array
        for(int i: arr){
            if(i % 2 != 0 ) count++;
        }
        //create array with size equals to count of non even elements
        int[] result = new int[count];
        //reset counter
        count = 0;
        //populate the final array with only non even elements
        for (int i: arr) {
            if(i % 2 != 0 ) {
                result[count] = i;
                count++;
            }
        }
        return result;
    }
}
