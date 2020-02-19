package datastructures.arrays;

import java.util.Arrays;

public class task4_arrayOfAllElementsExceptItself {
     /*
            In this problem, you have to implement the int[] findProduct(int[] arr) function,
            which will modify the whole array in such a way that each index will have a product of all numbers present in the array
            (except the number stored on the current index).

            Function Prototype #
                                    int[] findProduct(int[] arr)
            Sample Input #
                                    arr = {1,2,3,4}
            Sample Output #
                                    arr = {24,12,8,6}
     */

     public static void main(String[] args) {

         int[] arr = {1,2,3,4};

         Arrays.stream(findProduct(arr)).forEach(System.out::println);
     }

     // complexity of this solution is O(n^2)

     public static int[] findProduct(int arr[]) {
        int [] result = new int[arr.length];
        int temp = 0, valToSet = 1;

        for(int i = 0; i < arr.length; i++){
            valToSet = 1;
            for (int j = 0; j<arr.length; j++){
                if(i != j){
                    valToSet*=arr[j];
                }
            }
            result[i] = valToSet;
        }
        return result;
     }

}
