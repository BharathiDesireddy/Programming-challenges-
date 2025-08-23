
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsumerEx
{
    public static void main(String[] args) 
    {
        List<Integer> nums = Arrays.asList(4,8,2,3,7,5);

        Consumer<Integer> con = new Consumer<Integer>(){
            public void accept(Integer n){
                System.out.println(n);
            }
        };

        nums.forEach(con);        
        
    }
   
}