
import java.util.Scanner;

/*
 
input : B

output : 66

Explanation : It has to return the Ascii value of a character

 */

public class AsciiValueOfChar {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a character : ");
        char ch = s.next().charAt(0);

        System.out.println("ASCII value of "+ch+" : "+(int)ch);
    }
}
