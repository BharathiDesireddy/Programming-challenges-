/*
 String to number converting:

 Example : 

 input : Twelve Hundred Sixty One
 output : 1,261

 input : Twenty one million forty five thousand six hundred
 output : 21,045,600
 */


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringToNumber {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a String : ");
        String str = s.nextLine();

        String[] words = str.toLowerCase().split("\\s+");

        Map<String,Integer> numbermap = new HashMap<>();

        numbermap.put("one",1);
        numbermap.put("two",2);
        numbermap.put("three",3);
        numbermap.put("four",4);
        numbermap.put("five",5);
        numbermap.put("six",6);
        numbermap.put("seven",7);
        numbermap.put("eight",8);
        numbermap.put("nine",9);
        numbermap.put("ten",10);
        numbermap.put("eleven",11);
        numbermap.put("twelve",12);
        numbermap.put("thirteen",13);
        numbermap.put("fourteen",14);
        numbermap.put("fifteen",15);
        numbermap.put("sixteen",16);
        numbermap.put("seventeen",17);
        numbermap.put("eighteen",18);
        numbermap.put("nineteen",19);
        numbermap.put("twenty",20);
        numbermap.put("thirty",30);
        numbermap.put("forty",40);
        numbermap.put("fifty",50);
        numbermap.put("sixty",60);
        numbermap.put("seventy",70);
        numbermap.put("eighty",80);
        numbermap.put("ninety",90);

        Map<String ,Integer> multipliers = new HashMap<>();

        multipliers.put("hundred",100);
        multipliers.put("thousand",1000);
        multipliers.put("million",1000000);

        int current = 0;
        int total = 0;

        for(String word : words){
            if(numbermap.containsKey(word)){
                current += numbermap.get(word);
            }

            else if("hundred".equals(word)){
                current = current *100;
            }

            else if(multipliers.containsKey(word)){
                current*=multipliers.get(word);
                total+=current;
                current = 0;
            }
        }

        total+=current;

        String number = String.format("%,d",total);
        System.out.println(number);

    }
}
