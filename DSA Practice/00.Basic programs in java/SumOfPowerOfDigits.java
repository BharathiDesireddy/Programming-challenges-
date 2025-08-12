
import java.util.ArrayList;
import java.util.List;

/*
 Sum of power of digits
 input = 582109
 result = 5 pow 8 + 8 pow 2 + 2 pow 1 + 1 pow 0 +0 pow 9 + 9 pow 0
 */

 public class SumOfPowerOfDigits{
    public static void main(String[] args) {
        
        int n = 582109;

        List<Integer> list = new ArrayList<>();

        if(n>9){
            while(n>0){
                int temp = n%10;
                list.add(temp);
                n/=10;
            }
        }

        int result = 0;
        System.out.println(list);
        for(int i = 0 ; i<list.size();i++){
            if(i==0){
                result+=(double)Math.pow(list.get(i),0);
            }
            else{
                int a = list.get(i);
                int b = list.get(i-1);
                result+=Math.pow(a,b);
            }

        }

        System.out.println(result);

    }
 }