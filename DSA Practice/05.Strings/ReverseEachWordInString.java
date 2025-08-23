
import java.util.Scanner;

/*
 
input : Bharathi is a good girl

output : ihtarahb si a doog lrig
 */

public class ReverseEachWordInString {

    public static String reverseWord(String str){

        StringBuilder result = new StringBuilder();
        for(int i = str.length()-1 ; i>=0;i--){
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    public static String reversed(String str){

        String[] arr = str.split(" ");

        for (int i = 0 ; i<arr.length;i++){

            arr[i]=reverseWord(arr[i]);
        }

        return String.join(" ",arr);
    }


    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a sentence : ");
        String str = s.nextLine();

        String result = reversed(str);

        System.out.println("reversed each word i a sentence : "+result);
    }
}
