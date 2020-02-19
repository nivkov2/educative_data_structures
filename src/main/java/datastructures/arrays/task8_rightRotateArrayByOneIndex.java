package datastructures.arrays;

import java.util.Arrays;

public class task8_rightRotateArrayByOneIndex {
    /*
            In this problem, you have to implement the void rotateArray(int[] arr) function
            which will pick the last index from the right and rotate it to the left. This means that the right-most element
            will appear at the left-most position in the array, and so on.
            However, in this problem, you only have to rotate by one element from the right.

            Function Prototype #
                                    void rotateArray(int[] arr)
            Sample Input #
                                    arr = {1, 2, 3, 4, 5}
            Sample Output #
                                    arr = {5, 1, 2, 3, 4}
     */

    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 2, 6, 6};
        rotateArray(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }

    // solution complexity O(n^2)
    private static void rotateArray(int[] arr){
        int[] tempArr = new int[arr.length];
        int temp = arr[arr.length - 1];

        for(int i = arr.length-1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }

}
