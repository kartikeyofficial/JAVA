
import java.util.*;
public class ComparatorSorting {
    public static void main(String[] args) {
        List<String> name= new ArrayList<>();
        name.add("Kartikey");
        name.add("Rohit");
        name.add("Aman");
        name.add("Aditya");

        System.out.println("Unsorted Data: "+name);
        Collections.sort(name ,new Comparator<String>(){
            @Override
            public int compare(String str1, String str2){
                return str1.length()- str2.length();
            }
        } );
        System.out.println("Sorted Data: "+name);
    }

    
}
