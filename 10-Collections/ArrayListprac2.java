import java.util.*;

public class ArrayListprac2 {
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.ensureCapacity(100);   //used to set capacity of a list
        list.add(100);
        list.add(200);
        list.add(300);


        list.add(400);
        list.add(20);
        list.add(50);
        list.add(60);
        /*  Sort elements in list
        System.out.println(list);



        Collections.sort(list);
        System.out.println(list);

         */

        /*   Used to clone a list
        ArrayList<Integer> clone=(ArrayList<Integer>)list.clone();

        System.out.println(clone);

         */

        //Check wheter list is empty or not
        System.out.println(list.isEmpty());

        //Return index of element
        System.out.println(list.indexOf(60));
    }

}
