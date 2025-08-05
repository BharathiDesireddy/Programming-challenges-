
import java.util.Scanner;

/*
     *****
      ****
       ***
        **
         *
 */

public class P7 {
    public static void main(String[] args) {
        
        Scanner S = new Scanner(System.in);

        System.out.println("Enter n value : ");
        int n = S.nextInt();

        for(int i = 1;i<=n;i++){

            //for printing leading spaces..
            for(int j =1 ;j<=i;j++){
                System.out.print("  ");
            }

            //printing stars..
            for(int j = 1;j<=n-i+1;j++){
                System.out.print("* ");
            }

            //printing next line..
            System.out.println();
        }
    }
}
