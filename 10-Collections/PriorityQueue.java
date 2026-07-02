import java.util.*;

public class PriorityQueue {
    public static void main(String[] args) {
        /*Queue<Integer> q=new java.util.PriorityQueue<>();
        q.add(10);
        q.add(30);
        q.add(20);
        q.add(50);
        System.out.println(q);

        q.poll();

        System.out.println(q);

         */

        //Max Heap

        Queue<Integer> q=new java.util.PriorityQueue<>((a,b)->b-a);
        q.add(10);
        q.add(20);
        q.add(40);

        System.out.println(q.poll());
        System.out.println(q.poll());
    }
}
