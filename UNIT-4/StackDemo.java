import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {
        Stack<String> string= new Stack<>();
        string.push("Kartikey");
        string.push("Rajput");
        string.push("Bhumi");
        string.push("Tripathi");
        System.out.println("Stack: "+string);
        System.out.println("Item Pop: "+string.pop());
        System.out.println("Stack: "+string);
        System.out.println("Item Peaked: "+string.peek());
        System.out.println("Stack: "+string);
        System.out.println("Stack Empty: "+string.empty());
        System.out.println("Bhumi Found At Postion: "+string.search("Bhumi"));

        string.clear();
        System.out.println("Stack: "+string);
        System.out.println("Stack Empty: "+string.empty());
        System.out.println("Item Pop: "+string.pop());

    }
    
}
