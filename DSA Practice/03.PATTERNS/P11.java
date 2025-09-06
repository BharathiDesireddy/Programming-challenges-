
import java.util.Scanner;


/*
 
         *
        * *
       * * *
      * * * *
     * * * * *
     
    
 */


public class P11 {
    
    public static void main (String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the value of n :");
        int n = s.nextInt();

        for (int i = 1 ; i<=n ; i++){

            //printing spaces
            for (int j = 1 ; j<=n-i ; j++){
                System.out.print(" ");
            }

            //printing stars
            for(int j = 1 ; j<=i ; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
