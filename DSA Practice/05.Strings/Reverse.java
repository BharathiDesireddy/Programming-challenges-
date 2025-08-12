

/*

Reversing the given String..

 */

 
import java.util.Scanner;

class Reverse{

     static String reverse(String str){

        StringBuffer result = new StringBuffer();

        for(int i=str.length()-1;i>=0;i--){
            char ch =str.charAt(i);
            result.append(ch);
        }

        return result.toString();
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str1  = s.nextLine();
        System.out.println("Reverse of a string: "+reverse(str1));
    }
}