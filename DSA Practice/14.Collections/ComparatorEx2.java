
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
    int age;
    String name;

    public Student(int age, String name){
        this.age=age;
        this.name=name;
    }

    public String toString(){
        return name+ " : "+age;
    }

}

class ComparatorEx2
{
    public static void main(String[] args) {

        //we acn applay sorting for custom classes like in the following manner.
        //Otherwise we can use comparable interface to get the same result.

        Comparator<Student> com = new Comparator<Student>(){
            public int compare(Student i, Student j){
                if(i.age>j.age){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };
        List<Student> studs = new ArrayList<>();

        studs.add(new Student(20,"Bharathi"));
        studs.add(new Student(21,"Deepika"));
        studs.add(new Student(45,"Reshma"));
        studs.add(new Student(18,"kittu"));


        Collections.sort(studs,com);//sorts according to age.

       for(Student s: studs){
         System.out.println(s.toString());
       }
    }
}