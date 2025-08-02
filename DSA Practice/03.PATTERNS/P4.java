/*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
 */

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = s.nextInt();
        for(int i = 1 ;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(i<=j){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }

        System.out.println("Reverse Pattern");

        for(int i = 1 ;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(i>=j){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}
