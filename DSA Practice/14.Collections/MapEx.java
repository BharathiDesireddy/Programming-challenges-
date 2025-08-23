import java.util.HashMap;
import java.util.Map;

class MapEx
{
    public static void main(String[] args) 
    {
        Map<String,Integer> students = new HashMap<>();

        students.put("Bharathi",554);
        students.put("Deepika",515);
        students.put("Reshma",582);
        students.put("kittu",614);

        System.out.println(students);

        System.out.println(students.keySet());

        for(String key : students.keySet()){
            System.out.println(key+ " :  "+students.get(key));
        }

    }
}