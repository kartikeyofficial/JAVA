import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> string = new LinkedList<>();
        System.out.println("");
        System.out.println("LinkedList: "+string);
        System.out.println("Element added :Second");
        string.add("Second");
        System.out.println("Linked list: "+string);
        System.out.println("Elementadded : First");
        string.addFirst("First");
        System.out.println("LinkedList:"+string);
        System.out.println("Last Element Added: Third");
        string.addLast("Third");
        System.out.println("LinkedList: "+string);
        System.out.println("Element Offered: Fourth");
        string.offer("Fourth");
        System.out.println("LinkedList: "+string);

        System.out.println("First Element: "+string.getFirst());
        System.out.println("Last Element:"+string.getLast());
        System.out.println("Element at the Front(element()):"+string.element());
        System.out.println("Elememt at the Front :(Peak()):"+string.peek());

        System.out.println("");
        System.out.println("LinkedList:"+string);
        System.out.println("Elemnt Removed (remove()):"+ string.remove());
        System.out.println("LinkedList: "+string.remove() );
        System.out.println("First Element Removed:"+string.removeFirst());
        System.out.println("LinkedList:"+string);
        System.out.println("Last Element Removed:"+string.removeLast());
        System.out.println("LinkedList:"+string);
        System.out.println("Elemnr Removed (Poll())"+ string.remove());
        System.out.println("Linked List:"+string);


    }
    
}
