import java.util.*;
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String,Integer> marks= new TreeMap<>();
        marks.put("Kartikey",98);
        marks.put("Rohit",91);
        marks.put("Aditya",95);
        marks.put("Aman",83);
        marks.put("Ujjwal",81);
        //marks.put(null,67);   Null key Is Not allowded In the TreeMap
        marks.put("Izazul",null);

        Set<Map.Entry<String,Integer>> entrySet= marks.entrySet();
        for(Map.Entry<String,Integer> entry: entrySet){
            System.out.println("Name:"+entry.getKey());
            System.out.println("Marks: "+entry.getValue());
        }
    }
}
