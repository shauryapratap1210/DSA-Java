import java.util.*;

public class MapBasics2 {
    public static void main(String[] args) {
         Map<Integer,String> map=new HashMap<>();
         map.put(1,"One");
        map.put(2,"Two");
        System.out.println(map);

        //Iteration
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println("Key is : "+entry.getKey() +"\n"+"Value is : "+entry.getValue());
        }



    }
}
