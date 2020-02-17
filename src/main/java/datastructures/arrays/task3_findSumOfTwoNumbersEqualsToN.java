package datastructures.arrays;

import java.util.Arrays;

public class task3_findSumOfTwoNumbersEqualsToN {
    /*
        In this problem, you have to implement the int[] findSum(int[] arr, int n) function,
        which will take a number n and an array arr as an input and returns two integers that add up to n in an array.

        Function Prototype #
                                int[] findSum(int[] arr, int n)
        Sample Input #
                                arr = {1, 21, 3, 14, 5, 60, 7, 6}
                                value = 27
        Sample Output #
                                arr = {21, 6} or {6, 21}
     */
    public static void main(String[] args) {
        int [] arr = {1, 21, 3, 14, 5, 60, 7, 6};
        int value = 27;

        Arrays.stream(findSum(arr, value)).forEach(System.out::println);
    }

    // complexity of this solution is O(n^2)
    private static int[] findSum(int[] arr, int n){
        int[] result = new int[2];

        for (int i:arr) {
            for (int j = 1; j < arr.length-1; j++){
                if(i+arr[j] == n){
                    result[0] = i;
                    result[1] = arr[j];
                }
            }
        }
        return result;
    }


}
