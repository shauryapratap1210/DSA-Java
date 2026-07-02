import java.util.*;

public class Dequeue {
    public static void main(String[] args) {
        Deque<Integer> q=new ArrayDeque<>();
        q.offerFirst(10);
        q.offerLast(20);
        q.offerFirst(30);
        System.out.println(q);

        System.out.println(q.peekFirst());
        System.out.println(q.peekLast());

        System.out.println(q.pollFirst());
        System.out.println(q.pollLast());


    }
}
