
import java.util.Scanner;

/*
        1
      2 1 2
    3 2 1 2 3 
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5


 */

public class P9 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a value of n : ");
        int n = s.nextInt();

        //printing rows
        for(int i = 1; i<=n;i++){
            
            //printing spaces
            for(int j = 1; j<=n-i; j++){

                System.out.print("  ");

            }

            //printing decreasing part

            for(int j = i ; j>=1; j--){
                System.out.print(j+" ");
            }

            //printing increasing part
            for(int j = 2 ; j<=i; j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
