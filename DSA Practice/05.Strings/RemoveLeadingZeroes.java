
import java.util.Scanner;


/*

Given a string of digits, remove leading zeros from it.

Illustrations: 

Input : 00000123569
Output: 123569

Input: 000012356090
Output: 12356090


 */

public class RemoveLeadingZeroes {

    public static String removeZeroes(String str){
        StringBuilder sb = new StringBuilder(str);

        int i = 0 ;
        while(i<str.length() && sb.charAt(i)=='0'){
            i++;
        }

        sb.replace(0,i,"");

        return sb.toString();
    }
    
    public static void main (String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number that contains leading zeroes :");
        String str = s.nextLine();

        System.out.println("Resultant String afetr removing Leading Zeroes : "+removeZeroes(str));
    }
}
