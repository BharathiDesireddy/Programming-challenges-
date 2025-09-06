/*
 Input: str = "Abcdefghijklmnopqrstuvwxyz"
Output: Yes
Explanation: The given string contains all the letters from a to z (ignoring case).

Input: str = "GeeksForGeeks"
Output: No
Explanation: The given string does not contain all the letters from a to z (ignoring case).


 */

import java.util.Scanner;

public class PanagramString {
    
    public static void main (String[] args){

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string to check panagram : ");
        String str = s.nextLine();

        boolean isPanagram = true;

        str=str.toLowerCase();

        for(char ch = 'a' ; ch<= 'z' ; ch++){
            if(!str.contains(String.valueOf(ch))){

                isPanagram = false;
                break;
            }
        }

        if(isPanagram){
            System.out.println("YES");
        }

        else{
            System.out.println("No");
        }
    }
}
