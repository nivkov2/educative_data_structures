package datastructures.arrays;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class task2_mergeTwoSortedArrays {
    /*
        In this problem, given two sorted arrays, you have to implement the int[] mergeArrays(int[] arr1, int[] arr2) function
        which returns an array consisting of all elements of both arrays in a sorted way.

        Function Prototype #
                            int[] mergeArrays(int[] arr1, int[] arr2)
                            Here arr1 and arr2 are sorted already.

        Sample Input #
                        arr1 = {1, 3, 4, 5}
                        arr2 = {2, 6, 7, 8}
        Sample Output #
                        arr = {1, 2, 3, 4, 5, 6, 7, 8}
     */
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 6, 7, 8};

        Arrays.stream(mergeArrays(arr1, arr2))
                .forEach(System.out::println);
    }

    // complexity of this solution O(n + m)
    private static int[] mergeArraysViaStreamApi(int[] arr1, int[] arr2){
        AtomicInteger count = new AtomicInteger();
        int[] resultArray = new int[arr1.length + arr2.length];

        IntStream.range(0, arr1.length).forEach( i ->{
            resultArray[count.getAndIncrement()] = arr1[i];
        });

        IntStream.range(0, arr2.length).forEach( i ->{
            resultArray[count.getAndIncrement()] = arr2[i];
        });

        return Arrays.stream(resultArray)
                .sorted()
                .toArray();
    }

    // complexity of this solution O(n + m)
    private static int[] mergeArrays(int[] arr1, int[] arr2){
        int lengthFirst = arr1.length;
        int lengthSecond = arr2.length;
        int[] resultArray = new int[lengthFirst + lengthSecond];
        int i = 0, j = 0, k = 0;

        while (i < lengthFirst && j < lengthSecond){
            if(arr1[i] < arr2[j]){
                resultArray[k++] = arr1[i++];
            }else{
                resultArray[k++] = arr2[j++];
            }
        }

        while (i < lengthFirst){
            resultArray[k++] = arr1[i++];
        }
        while (j < lengthSecond){
            resultArray[k++] = arr2[j++];
        }
        return resultArray;
    }

}
