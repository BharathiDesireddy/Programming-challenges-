/*


Given an array of integers arr[], the task is to find the minimum and maximum elements in the array using recursion only.

Examples:

Input: arr[] = [1, 4, 3, -5, -4, 8, 6]
Output: min = -5, max = 8

Input: arr[] = [1, 4, 45, 6, 10, -8]
Output: min = -8, max = 45

Input: arr[] = [12, 3, 15, 7, 9]
Output: min = 3, max = 15


 */

public class MaxMinInArray {
    
    public static void main (String[] args){

        int[] arr = {1,4,3,-5,-4,8,6};

        int[] res = findMinMax(arr);

        System.out.println("Min : "+res[0]+"\nMax : "+res[1]);
    }

    private static int[] findMinMax(int[] arr) {

        int n = arr.length;

        int minimum = findMin(arr,n);
        int maximum = findMax(arr,n);

        return new int[] {minimum,maximum};
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    private static int findMin(int[] arr, int n) {

        if (n==1){
            return arr[0];
        }

        int min = findMin(arr,n-1);

        if(min<arr[n-1]){
            return min;
        }
        else{
            return arr[n-1];
        }
        
    }

    private static int findMax(int[] arr, int n) {

        if (n==1){
            return arr[0];
        }

        int max = findMax(arr,n-1);

        if(max>arr[n-1]){
            return max;
        }
        else{
            return arr[n-1];
        }
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}
