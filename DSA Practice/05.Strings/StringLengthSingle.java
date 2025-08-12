
/*
 Compressing string length until it comes to singledigit...

 example: 
 input: Wipro Technologies
 output: 9
 Explanation : total lenghth is 17 without spaces
              =1+7
              =8
 */

public class StringLengthSingle {
    public static void main(String[] args) {
        String str = "Wipro technologies";
        String[] s = str.trim().split(" ");
        int len =0;
        for(int i=0;i<s.length;i++){
            len+=s[i].length();
        }
        while(len>10){
            int temp=0;
            while(len>0){
                temp += len%10;
                len/=10;                
            }
            len=temp;

        }
        System.out.println(len);

    }
}
