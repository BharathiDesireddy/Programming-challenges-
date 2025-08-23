
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

//writing a program to get the sum of even numbers by doubling each value

class StreamAP
{
    public static void main(String[] args) 
    {
        List<Integer> nums = Arrays.asList(4,8,2,3,7,5);

        //method:1--normal procedure
        int sum=0;
        for(int n :nums){
            if(n%2==0){
                n=n*2;
                sum+=n;
            }
        }
        System.out.println(sum);


        //method:2--by using Stream

        /*Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n->n%2==0);
        Stream<Integer> s3 = s2.map(n->n*2);
        int result = s3.reduce(0,(a,b)->a+b);
        System.out.println(result);*/


        //method:3--by writing method:2 in single line

        int result = nums.stream()
                        .filter(n->n%2==0)//we can pass p 
                        .map(n->n*2)//we can pass fun
                        .reduce(0,(a,b)->a+b);
        System.out.println(result);

        //we can do the method in the following manner also

        Predicate<Integer> p = n->n%2==0;
        Function<Integer,Integer> fun = n->n*2;
        
        

        //s1.forEach(n->System.out.println(n));    
        //s1.forEach(n->System.out.println(n)); //gives runtime error because we can use s1 of forEach only once.    
        //s2.forEach(n->System.out.println());//gives even numbers only.
    }
   
}