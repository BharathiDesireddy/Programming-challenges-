
import java.util.Arrays;



/*
encoded =[7,16,8,16,12,3]
original =[a,b,c,d,e,f]
a+b=7
b+c=6
c+d=8
d+e=16
e+f=12
f=3
we have to calculate original array

*/


public class Encoding {
    public static void main(String[] args){
        int[] encoded = {7,6,8,16,12,3};
        int original[] = new int[encoded.length];
        for(int i = encoded.length-1;i>=0;i--){
            if(i==encoded.length-1){
                original[i]=encoded[i];
            }
            else{
                original[i] = encoded[i]-original[i+1];
            }
        }
        //for(int i:original)
        //System.out.print(i+" ");
        System.out.print(Arrays.toString(original));
    }
}
