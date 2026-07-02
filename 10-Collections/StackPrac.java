import java.util.*;

public class StackPrac {
    public static void main(String[] args) {
        Deque<Integer>  stack=new ArrayDeque<>();
        stack.push(20);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
//        System.out.println(stack.empty());             Only Stack<>(); operations
//        System.out.println(stack.search(40));
    }
}
