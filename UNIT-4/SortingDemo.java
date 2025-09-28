import java.util.*;
public class SortingDemo {

    public static void main(String[] args) {
        List<String> name= new ArrayList<String>();
        name.add("Kartikey");
        name.add("Rohit");
        name.add("Aman");
        name.add("Aditya");
        System.out.println("Unsorted Data: "+name);
        Collections.sort(name);
        System.out.println("Sorted Data: "+name);


    }
    
}
