import java.util.*;
public class ComparatableBasics {
    public static void main(String[] args) {
        List<Stu2> students=new ArrayList<>();
        students.add(new Stu2("Shaurya",19,65));
        students.add(new Stu2("Naitik",11,69));
        students.add(new Stu2("Pranjal",12,45));
        students.add(new Stu2("Piyush",19,55));
        System.out.println(students);

        Collections.sort(students);
        System.out.println(students);



    }

}
