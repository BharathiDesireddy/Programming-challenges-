
import java.util.Scanner;

public class P5 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = s.nextInt();
        for (int i = 1; i <=n; i++) {
            for(int j = 1; j<=n;j++){
                if(i>=j){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <n; i++) {
            for(int j = 1; j<n;j++){
                if(i<=j){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
}
