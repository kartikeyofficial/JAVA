import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
     public static void main(String[] args) {
        LinkedHashMap<String,Integer> marks= new LinkedHashMap<>();
        marks.put("Kartikey",98);
        marks.put("Aman",87);
        marks.put("Rohit",91);
        marks.put("aditya",95);
        marks.put(null, 56);
        marks.put("ujjwal",null);
        marks.put(null, 45);
        marks.put("Izazul", 78);
        Set<Map.Entry<String,Integer>> entrySet= marks.entrySet();
        for(Map.Entry<String,Integer> entry: entrySet){
            System.out.println("Name: "+entry.getKey());
            System.out.println("Marks: "+entry.getValue());
        }
    }

}
