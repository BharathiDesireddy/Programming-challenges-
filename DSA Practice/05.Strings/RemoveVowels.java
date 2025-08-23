
import java.util.Scanner;

/*
 
input : Bharathi

output : Bhrth

Explanation : remove vowels from given String


 */

public class RemoveVowels {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = s.nextLine();

        String vowels = "aeiouAEIOU";
        StringBuilder result = new StringBuilder("");
        
        for(int i = 0 ; i<str.length(); i++){

            if(vowels.indexOf(str.charAt(i))==-1){
                result.append(str.charAt(i));
            }
        }

        System.out.println("Resultant String after removing vowels : "+result.toString());
    }
}
