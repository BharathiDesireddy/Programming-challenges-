
import java.util.Scanner;

/*

 input : Bharathi is a good girl.

 output : 5

 Explanation : returns the number of words in a sentence and ignore spaces.
 */


public class CountWordInString {

    public static int method1(String str){

        String[] arr = str.split(" ");

        return arr.length;

    }

    public static int method2(String str){

        int count = 0;

        for(int i = 0 ;i <str.length();i++){
            if(str.charAt(i)==(' ')){
                count+=1;
            }
        }

        return count+1;
        
    }

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a sentence : ");
        String str = s.nextLine();

        int length = method1(str);

        System.out.println("Count of words in a sentence : "+length);

        length = method2(str);
        System.out.println("Count of words in a sentence : "+length);


    }
}
