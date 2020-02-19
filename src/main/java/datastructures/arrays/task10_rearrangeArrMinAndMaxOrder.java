package datastructures.arrays;

import java.util.Arrays;

public class task10_rearrangeArrMinAndMaxOrder {
    /*
           In this problem, you have to implement the void maxMin(int[] arr) function. This will re-arrange the elements of a sorted array in such a way
           that the first position will have the largest number, the second will have the smallest,
           the third will have the second largest, and so on.

           Function Prototype #
                                    void maxMin(int[] arr)
            Sample Input #
                                    arr = {1, 2, 3, 4, 5}
            Sample Output #
                                    arr = {5, 1, 4, 2, 3}
     */

    public static void main(String[] args) {
        int[]  arr = {1, 2, 3, 4, 5, 6};
        maxMin(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }

    //solution complexity O(n)
    public static void maxMin(int[] arr) {
        int minCounter = 1;
        int maxCounter = 0;
        int[] result = new int[arr.length];
        int limit = arr.length / 2;

        for (int i = 0; i < limit; i++){
            result[maxCounter] = arr[arr.length-1-i];
            result[minCounter] = arr[i];
            minCounter+=2;
            maxCounter+=2;
        }

        if(arr.length % 2 != 0){
            result[arr.length-1] = arr[arr.length/2];
        }

        for (int i = 0; i < arr.length; i++){
            arr[i] = result[i] ;
        }
    }
}
