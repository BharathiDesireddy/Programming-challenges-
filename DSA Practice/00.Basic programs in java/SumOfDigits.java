/*
input : 582109
output : 85

Explanation : (5+8+2+1+0+9)+(8+2+1+0+9)+(2+1+0+9)+(1+0+9)+(0+9)+(9)
             =25+20+12+10+9+9
             =85
*/


import java.util.ArrayList;
import java.util.List;

public class SumOfDigits {
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

        for(int i = 0 ; i < list.size();i++){
            int sum =0;
            for(int j = 0; j<=i;j++){
                sum+=list.get(j);
            }
            result+=sum;
        }

        System.out.println(result);
    }
}
