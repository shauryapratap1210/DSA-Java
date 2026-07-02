import java.util.ArrayList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;



public class ArrayListprac {
    public static void main(String args[]){
        //ArrayList Implementation

      ArrayList<Integer> arr=new ArrayList<>();
      List<Integer> list=new ArrayList<>();
      List<Integer> collect=new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr);

//        arr.add(40);
//        System.out.println(arr);

//        list.add(101);
//        list.add(102);
//        System.out.println(list);

        /*Remove
        list.remove(0);
        System.out.println(list);

         */

        /* Add elements of one list to another
        list.addAll(arr);
          System.out.println(list);
         */

        /* Remove elements of one list from another
        list.addAll(arr);

        System.out.println(list);
        list.removeAll(arr);
        System.out.println(list);

         */

        /* Returns size of list
        System.out.println(list.size());
         */

        /* Empty a list
        list.clear();
         */
//        System.out.println(list);

        /*Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println("Element: "+ iterator.next());
        }

         */

        collect.add(100);
      collect.add(200);
      collect.add(300);
      collect.add(400);
      System.out.println(collect);
     // System.out.println(collect.get(2)); used to fetch element from list


     /*  Used to set element at desired index
      collect.set(2,1000);
      */
//      System.out.println(collect);

      /* Used to convert any data structure to array
      Object array[] = collect.toArray();

      for(Object obj:array){
        System.out.println(obj);
      }

       */



    }
}
