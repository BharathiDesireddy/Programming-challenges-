
/*
  Finding Duplicate Characters in a string.
  
  Example: 

  input : Bharathi
  output : ['a'.'h']

 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicatecharInString {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str = s.nextLine();

        List<Character> list = new ArrayList<>();
        List<Character> duplicates = new ArrayList<>();
        
        for(char ch : str.toLowerCase().toCharArray()){
            if(list.contains(ch)){
                duplicates.add(ch);
            }
            else{
                list.add(ch);
            }
        }

        System.out.println(duplicates);
    }
}
