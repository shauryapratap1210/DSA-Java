import java.util.*;

public class HashSetBasics {
    public static void main(String[] args) {
       /* Set<Integer> st=new HashSet<>();
        Set<Integer> st2=new HashSet<>();
        st.add(10);
        st.add(20);
        st.add(10);
        st.add(30);
        st.add(10);
        System.out.println(st);

        st2.add(60);
        st2.add(50);
        st2.add(30);

        System.out.println(st2);

        System.out.println(st.retainAll(st2));

        */

        Set<Integer> st=new LinkedHashSet<>();
        st.add(10);
        st.add(20);
        st.add(10);
        st.add(20);
        st.add(10);
        st.add(20);
        st.add(10);
        st.add(30);
        System.out.println(st);



    }
}
