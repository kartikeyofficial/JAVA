public class InheritanceConstructor {
    int x;
    InheritanceConstructor(){
        System.out.println("Super Constructor:");
        x=10;

    }
}
class SecondClass extends InheritanceConstructor{
    int y;
    SecondClass(){
        System.out.println("Sub Constructor:");
        x=10; y=20;
    }
    void Display(){
        System.out.println(x+" And "+y);
    }
}
class Main{
    public static void main(String[] args) {
        SecondClass r1= new SecondClass();
        r1.Display();
    }
}
