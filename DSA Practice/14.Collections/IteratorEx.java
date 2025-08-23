import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class IteratorEx
{
    public static void main(String[] args) {
        {
            Set<Integer> s = new TreeSet<>();

            s.add(8);
            s.add(4);
            s.add(84);
            s.add(8);//does't allow duplicate values
            s.add(54);

            System.out.println(s);//sorted order

            System.out.println(s.size());//4

            Iterator<Integer> values = s.iterator();

            while(values.hasNext()){
                System.out.println(values.next());
            }
        }
    }
}