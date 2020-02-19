package datastructures.arrays;

public class task6_firstNonRepeatingValue {
     /*
            In this problem, you have to implement the int findFirstUnique(int[] arr) function
            that will look for a first unique integer which appears only once in the whole array.

            Function Prototype #
                                    int findFirstUnique(int[] arr)
            Sample Input #
                                    arr = {9, 2, 3, 2, 6, 6}
            Sample Output #
                                    9
     */

    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 2, 6, 6};

        System.out.println(findFirstUnique(arr));
    }

    // solution complexity is O(n^2)
    public static int findFirstUnique(int[] arr){
        boolean  isUnique;
        for(int i = 0; i < arr.length ; i++){
            isUnique = true;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j] & i != j) {
                    isUnique = false;
                    break;
                }
            }
            if(isUnique) return arr[i];
        }
        return -1;
    }

}
