/*
Addition using Strings....
 */

public class AdditionUsingStrings {

    static String add(String a,String b){
        int n1=Integer.parseInt(a);
        int n2 = Integer.parseInt(b);
        Integer result = n1+n2;
        return result.toString();
    }
    public static void main(String[] args) {
        String a = "1234";
        String b = "1056";
        System.out.println(add(a,b));

    }
}
