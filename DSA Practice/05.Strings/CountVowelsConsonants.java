
import java.util.Scanner;

/*
  Problem : count number of vowels , consonants and spaces in a string.

  input : Bharathi Desireddy

  output: vowels = 6
          consonants = 11
          spaces = 1
 */

public class CountVowelsConsonants {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a String : ");
        String str = s.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;
        int spaceCount = 0;
        int specialCharCount= 0 ;

        String vowels = "aeiouAEIOU";

        for(int i = 0 ; i<str.length(); i++){

            char ch = str.charAt(i);

            if (ch==' '){
                spaceCount+=1;
            }
            else if (vowels.indexOf(ch)!=-1){
                vowelCount+=1;
            }
            else if ((ch >= 'A' &&  ch<='Z') || (ch>='a' && ch<='z')){
                consonantCount+=1;
            }
            else{
                specialCharCount+=1;
            }
        }

        System.out.println("Vowels Count : "+vowelCount+"\nConsonant count : "
                          +consonantCount+"\nSpace count : "+spaceCount
                          +"\nSpecial characters count : "+specialCharCount);
    }
}
