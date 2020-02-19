package datastructures.arrays;

public class task7_secondMaxValue {
    /*
            In this problem, you have to implement the int findFirstUnique(int[] arr) function
            that will look for a first unique integer which appears only once in the whole array.

            Function Prototype #
                                    int findSecondMaximum(int[] arr)
            Sample Input #
                                    arr = {9,2,3,6}
            Sample Output #
                                    6
     */

    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 2, 6, 6};

        System.out.println(findSecondMaximum(arr));
    }

    // solution complexity is O(n)
    private static int findSecondMaximum(int[] arr) {
        int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;

        for(int i : arr){
            if(i > max){
                secMax = max;
                max = i;
            }else if(i > secMax & secMax != max){
                secMax = i;
            }
        }
        return secMax;
    }
}
