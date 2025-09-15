

/*

     * * * * *
      * * * *
       * * *
        * *
         *
        * *
       * * *
      * * * *
     * * * * *
     
     

 */
import java.util.Scanner;

public class P13 {
    
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the value of n : ");
        int n = s.nextInt();

        //upper part

        for(int i =1; i<=n; i++){

        //printing spaces
        for(int j = 1; j<i; j++){
            System.out.print(" ");
        }

        //printing stars
        for (int j = i ; j<=n; j++){
            System.out.print("* ");
        }

        System.out.println();

        }

        //lower part

        for (int i = 2 ; i<=n ; i++){

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
