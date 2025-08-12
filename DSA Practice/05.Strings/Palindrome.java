

/*

 Program to check whether the String is A palindrome or not..
 
 */


import java.util.Scanner;

public class Palindrome {

    static String reverse(String str){

        StringBuffer result = new StringBuffer();

        for(int i=str.length()-1;i>=0;i--){
            char ch =str.charAt(i);
            result.append(ch);
        }

        return result.toString();
    }

    static boolean isPalindrome(String str){
        if(reverse(str).equals(str)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = s.nextLine();
        if(isPalindrome(str)){
            System.out.print(" Palindrome String..");
        }
        else{
            System.out.print("Not Palindrome...");
        }

    }
}

