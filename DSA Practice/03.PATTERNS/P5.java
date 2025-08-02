/*
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
 */
import java.util.Scanner;

public class P5 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = s.nextInt();

        // Upper part
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part
        for (int i = n - 1; i >= 1; i--) {
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        s.close(); // close scanner to avoid warning
    }
}

