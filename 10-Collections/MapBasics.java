import java.util.*;

public class MapBasics {
    public static void main(String args[]){
        Map<String ,String> mapping=new HashMap<>();

        //Insertion
       /* mapping.put("en","england");
//        mapping.put("en","England");      Value with key en will get updated
        mapping.put("us","united states");
        mapping.put("in","india");
        mapping.put("uk","united kingdom");
        System.out.println(mapping);

        */

        Map<String ,String > m2=new HashMap<>();
        m2.put("br","Brazil");
        m2.put("en","England");
        m2.put("r","Russia");
        System.out.println("Before : "+m2);

        /*m2.putAll(mapping);
        System.out.println("After: "+m2);

         */

        //Deletion

        m2.remove("en");
        System.out.println("After deletion: "+m2);

        System.out.println("Size is : "+m2.size());

       /* m2.clear();
        System.out.println(m2.size());

        */

        /*m2.putIfAbsent("is","India 3");
        System.out.println(m2);

         */

        //Accessing
        System.out.println(m2.get("r"));

        System.out.println(m2.getOrDefault("is","NONE"));

        System.out.println(m2.containsKey("r"));

        System.out.println(m2.containsValue("Russia"));

        //Updation

        m2.replace("r","Rustom");
        System.out.println(m2);

        m2.replace("r","Rustom","Russia");
        System.out.println(m2);

        //Fetching

        Set<String> st=m2.keySet();
        System.out.println("Key set is :"+st);


        Collection<String> valueSet=m2.values();
        System.out.println("Value is :" +valueSet);


        Set<Map.Entry<String,String>> entry=m2.entrySet();
        System.out.println("Entries are : "+entry);









    }
}

