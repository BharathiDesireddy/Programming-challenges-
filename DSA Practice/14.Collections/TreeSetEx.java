import java.util.Set;
import java.util.TreeSet;

class TreeSetEx
{
    public static void main(String[] args) {
        {
            Set<Integer> s = new TreeSet<>();

            s.add(8);
            s.add(4);
            s.add(84);
            s.add(8);//does't allow duplicate values

            System.out.println(s);//sorted order

            System.out.println(s.size());//3
        }
    }
}