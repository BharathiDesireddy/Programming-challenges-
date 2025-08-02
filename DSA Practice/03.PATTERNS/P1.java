
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = s.nextInt();
        for(int i = 0 ;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
