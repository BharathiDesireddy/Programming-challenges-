/*
         *
        **
       ***
      ****
     *****

 */

import java.util.Scanner;

public class P6 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enetr n value : ");
        int n = s.nextInt();

        for(int i = 1; i<=n;i++){
            //for printing leading spaces..
            for(int j = 1;j<=n-i;j++){
                System.out.print("  ");
            }

            //printing stars.
            for(int j =1 ;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

