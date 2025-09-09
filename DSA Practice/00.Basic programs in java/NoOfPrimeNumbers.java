/*
problem : Read an integer and return number of prime numbers in that input
input : 423

output : 2

Explanation : there are two numbers in given input , 2 and 3 .

 */


import java.util.Scanner;

public class NoOfPrimeNumbers {

    public static  int count(int n){
        int res = 0;

        while (n>0){

            int d = n%10;

            if (isPrime(d)){
                res+=1;
            }

            n/=10;
        }

        return res;
    }

    private static boolean isPrime(int d){

        for (int i = 2 ; i<=d/2 ;i++){
            if(d%i==0){
                return false;
            }
        }

        return true;
    }

    public static void main (String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter an integr : ");
        int n = s.nextInt();

        System.out.println("No.of prime numbers in "+n+" : "+count(n));
    }
    
}
