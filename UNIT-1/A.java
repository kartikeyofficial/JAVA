public class A {
    private int x=10;
    public int Getx(){
        return x;
    }
}
class Amain{
    public static void main(String[] args) {
        A a1= new A();
        System.out.println("Value Of X is: "+a1.Getx());
    }
}
