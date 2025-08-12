/*
   Write a java program to to count the occurences of characters in a string...
 */
import java.util.Scanner;

public class Occurences {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = s.nextLine();
        //str.toLowerCase();
        int[] count = new int[26];
        for(char ch : str.toLowerCase().toCharArray()){
            if(ch>='a' && ch <='z'){
                count[ch-'a']++;
            }
        }

        for(int i = 0;i<count.length;i++){
            if(count[i]>0){
                System.out.println((char)(i+'a') +" : "+count[i]);
            }
        }
    }
}
