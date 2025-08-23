public class LuckyNumber{
    public static int findLucky(int N,String S){
        int lucky=0;
        for(int i=0;i<N;i++){
            int index=i+1;
            int Ascii=(int) S.charAt(i);
            if(index%2==1 || Ascii%2==1){
                lucky+=(index*Ascii);
            }
        }
        return lucky;
    }
    public static void main(String[] args){
        int N=5;
        String s="JAMES";
        System.out.println(findLucky(N,s));
    }
}