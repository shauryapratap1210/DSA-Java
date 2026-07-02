import java.util.*;
public class ComparatorBasics {
    public static void main(String[] args) {
        List<Stu2> students=new ArrayList<>();
        students.add(new Stu2("Aryan",15,45));
        students.add(new Stu2("Shreyas",18,65));
        students.add(new Stu2("Gautam",17,75));
        System.out.println(students);

        /*Collections.sort(students, new Comparator<Stu2>() {
            @Override
            public int compare(Stu2 o1, Stu2 o2) {
                return o2.weight-o1.weight;
            }
        });

         */

        //Lambda Expression
        Collections.sort(students,  ( o1, o2) ->  o2.weight-o1.weight);



        System.out.println(students);



    }
}
