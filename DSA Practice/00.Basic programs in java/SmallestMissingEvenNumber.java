
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*

 Problem : 
          Given an array of integers, find the smallest missing even number.
          -if all even numbers are upto the maximum are present, return the next even number after the largest even number.
 
 input1 : 5 
 input2 : {2,4,6,8,12}

 output : 10

 */

public class SmallestMissingEvenNumber {

    public static int findMissingEven(int[] arr){
        
        //method 1 :  for only sorted and unique values..
        /* 
        int temp = 2;

        for (int num : arr){
            if(num!=temp){
                return temp;
            }
            temp+=2;
        }

        return arr[arr.length-1]+2;

        */



        //method 2 : for any type of arrays...

        Set<Integer> even = new TreeSet<>();
        
        for(int num : arr){
            if(num%2==0 && num>0){
                even.add(num);
            }
        }

        int temp = 2;
        for(int num : even){
            if(temp!=num){
                return temp;
            }

            temp+=2;
        }

        return temp;
    }
    
    public static void main (String[] args){

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the values : ");
        for(int i = 0 ;i<n ; i++){
            arr[i] = s.nextInt();
        }

        int result = findMissingEven(arr);
        System.out.println("The smallest missing even number : "+result);
    }
}
