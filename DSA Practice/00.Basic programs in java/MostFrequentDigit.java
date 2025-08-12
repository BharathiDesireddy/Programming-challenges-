/*
 int[] a = {1237.262,666,140};
 most occered digit = 6
 frquency of most occured digit = 4
 */

import java.util.HashMap;
import java.util.Map;

public class MostFrequentDigit {
    public static void main(String[] args) {
         
        int[] a = {1237,262,666,140};

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ;i<a.length;i++){
            while(a[i]>0){
                int temp = a[i]%10;
                if(!map.containsKey(temp)){
                    map.put(temp,1);
                }
                else{
                    map.put(temp,map.get(temp)+1);
                }
                a[i]/=10;
            }
        }

        int digit = -1;
        int frequency = 0;

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() > frequency) {
                digit = pair.getKey();
                frequency = pair.getValue();
            }
        }

        System.out.println(digit+ " "+ frequency);
    }
}
