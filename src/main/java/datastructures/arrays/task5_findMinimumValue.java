package datastructures.arrays;

public class task5_findMinimumValue {
    /*
            In this problem, you have to implement the int findMinimum(int[] arr) function
            which will traverse the whole array and find the smallest number in the array.

            Function Prototype #
                                    int findMinimum(int[] arr)
            Sample Input #
                                    arr = {9, 2, 3, 6}
            Sample Output #
                                    2
     */

    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 6};

        System.out.println(findMinimum(arr));
    }

    public static int findMinimum(int[] arr) {
        int minValue = Integer.MAX_VALUE;
        for(int i:arr){
            if( i < minValue){
                minValue = i;
            }
        }
        return minValue;
    }

}
