import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        Vector<String> languages = new Vector<>();
        System.out.println("Capacity "+ languages.capacity());

        System.out.println("Element added: Java");
        languages.addElement("Java");
        System.out.println(languages);

        System.out.println("Element C Inserted at Index 0");
        languages.insertElementAt("C", 0);
        System.out.println(languages);

        System.out.println("Element C++ set st Index 1");
        languages.setElementAt("C++", 1);
        System.out.println(languages);

        System.out.println("First Element: "+ languages.firstElement());
        System.out.println("Last Element: "+ languages.lastElement());

        System.out.println(languages);
        System.out.println("Element Remove At Index 1: ");
        languages.removeElementAt(1);

        System.out.println(languages);
        System.out.println("Element removed: Python");
        languages.removeElement("Python");
        System.out.println(languages);
        System.out.println("All Elements Removed.");
        languages.removeAllElements();
        System.out.println(languages);
    }
}
