import java.util.ArrayList;

class ArrayListOperations
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list1 = new ArrayList<>();

        //inserting elements
        list1.add(34);
        list1.add(45);
        list1.add(82);
        list1.add(54);

        System.out.println(list1);

        list1.remove(0);

        System.out.println(list1);

        System.out.println(list1.get(0));

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(101);
        list2.add(198);
        list2.add(137);
        list2.add(194); 
        list2.add(126);
        
        list1.addAll(list2);

        System.out.println(list1);

        System.out.println(list1.contains(54));

        System.out.println(list1.indexOf(82));

        System.out.println(list1.size());

        System.out.println(list1.isEmpty());

        list2.clear();

        System.out.println(list2);

    }
}