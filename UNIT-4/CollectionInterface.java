import java.util.*;
public class CollectionInterface {
    public static void main(String[] args) {
        Collection<Integer> collection= new ArrayList<>(); //Create A  Collection
        collection.add(1);
        collection.add(2);
        collection.addAll(collection);
        System.out.println(collection);

        System.out.println(collection.contains(3));
        System.out.println(collection.contains(2)); // it is used to check the hat element is present or not
        System.out.println(collection.containsAll(collection));

        Collection<Integer> collection2= new ArrayList<Integer>() ;
               collection2.add(3);
               collection2.add(4);
               System.out.println(collection2);

        System.out.println(collection2.contains(collection2));
        System.out.println(collection2.containsAll(collection));

        collection2.addAll(collection);
        System.out.println(collection2);

        System.out.println(collection2.containsAll(collection));

        // collection.remove(2);  // Remove the zSingle element
        // System.out.println(collection);
        // collection2.removeAll(collection); // Remove tHe Whole Collection
        // System.out.println(collection2);

        collection2.retainAll(collection);
        System.out.println(collection2); // Remove The Ehole Elements Of Collection2
        
        System.out.println(collection.size());
        System.out.println(collection2.size());

        System.out.println("The Print The ToArray Elements:");
        Object[] arr = collection.toArray();
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

        collection.clear();   // Clear All The Item From The Collection
        System.out.println(collection);

        System.out.println(collection.isEmpty());
        
    }
}
