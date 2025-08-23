import java.util.ArrayList;
import java.util.List;


class CollectionEx{
    public static void main(String[] args){
        /*Collection nums = new ArrayList();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        System.out.println(nums);// [1,2,3,4]

        for (Object num:nums) {
            System.out.println(num);
        }

        */

       List<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(1);//can allow duplicate values

        System.out.println(nums);// [1,2,3,4]

        for (int num:nums) {
            System.out.println(num);
        }

    }
}