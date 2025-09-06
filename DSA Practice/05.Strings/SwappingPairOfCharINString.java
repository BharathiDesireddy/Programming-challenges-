
import java.util.Scanner;


/*
 
input: str = “Java”
Output: aJav

Explanation: The given string contains even number of characters. 
             Therefore, we swap every pair of characters.

Input: str = “GeeksForGeeks”
Output: eGkeFsroeGkes

Explanation: The given string contains odd number of characters. 
             Therefore, we swap every pair of characters and last character remains as it is.


 */

public class SwappingPairOfCharINString {
    
    public static void main (String[] args){

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = s.nextLine();

        char[] chars = str.toCharArray();

        for(int i = 0 ; i<chars.length-1;i+=2){
            char temp = chars[i];
            chars[i]=chars[i+1];
            chars[i+1]=temp;
        }

        System.out.println("The resultant string after swapping every pair of characters : "+new String(chars));
    }
}
