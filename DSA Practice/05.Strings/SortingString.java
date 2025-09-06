
import java.util.Scanner;

/*
  input : Bharathi

  output : aaBhhirt

  Explanation : it has to return the sorted form of given string ...
 */

public class SortingString {

    public static String sortString(String str){

        char[] ch = str.toCharArray();

        //method 1 : general approach

        for(int i = 0; i<ch.length;i++){
            for(int j = 0 ; j<ch.length-i-1;j++){
                if (Character.toLowerCase(ch[j])>Character.toLowerCase(ch[j+1])){
                    char temp = ch[j];
                    ch[j]=ch[j+1];
                    ch[j+1]=temp;
                }
            }

        }

       //we can also solve this using comparator....

        return new String(ch);
    }
    
    public static void main (String[] args){

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String original = s.nextLine();

        String sorted = sortString(original);

        System.out.println("The sorted form of a string is : "+sorted);

    }
}
