import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(1,2); // First Is Index Position and Second Position Is the Element Position
        list.set(2, 4);
        System.out.println(list);

        System.out.println(list.get(1)); // 1 Index Position par list mei Kon sa Element Present hai.
        list.remove(0); // Remove The 0th index Element
        System.out.println(list);
        list.add(4);

        System.out.println(list.indexOf(2)); //The First Occurance Of the element 2 Index Position
        System.out.println("The first Occurance Of The 4 is:");
        System.out.println(list.indexOf(4));
        System.out.println("The Last Occurance Of tHe Element 4:");
        System.out.println(list.lastIndexOf(4));
        System.out.println(list);

        System.out.println("Sublist Of the list Index Between 1 to 3:");
        System.out.println(list.subList(1, 3));
          
    }
}
