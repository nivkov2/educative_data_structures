package datastructures.arrays;

import java.util.Arrays;

public class task9_rearrangePositiveAndNegativeValues {
    /*
           In this problem, you have to implement the void reArrange(int[] arr) function
           which will sort the elements, such that all the negative elements appear at the left and positive elements appear at the right.

            Function Prototype #
                                    void reArrange(int[] arr)
            Sample Input #
                                    arr = {10, -1, 20, 4, 5, -9, -6}
            Sample Output #
                                    arr = {-1, -9, -6, 10, 20, 4, 5}
     */

    public static void main(String[] args) {
        int[] arr = {10, -1, 20, 4, 5, -9, -6};
        reArrange(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }

    // solution complexity O(n)
    private static void reArrange(int[] arr){
        int[] tempArr = new int[arr.length];
        int counter = 0;

        for(int i: arr){
            if(i < 0){
                tempArr[counter++] = i;
            }
        }
        for(int i: arr){
            if(i > 0){
                tempArr[counter++] = i;
            }
        }
        for(int i = 0; i < tempArr.length; i++){
            arr[i] = tempArr[i];
        }
    }

}
