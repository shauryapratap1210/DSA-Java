import java.util.*;

public class LinkedListprac {
    public static void main(String args[]){
        List<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(30);
        list.add(50);
        list.add(30);
        System.out.println(list);
        System.out.println(list.lastIndexOf(30));

        list.addFirst(234);
        System.out.println(list);

        list.addLast(234);
        System.out.println(list);
    }


}
