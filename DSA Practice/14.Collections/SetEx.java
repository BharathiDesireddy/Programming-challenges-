import java.util.HashSet;
import java.util.Set;

class SetEx
{
    public static void main(String[] args) {
        {
            Set<Integer> s = new HashSet<>();

            s.add(8);
            s.add(4);
            s.add(84);
            s.add(8);//does't allow duplicate values

            System.out.println(s);

            System.out.println(s.size());
        }
    }
}