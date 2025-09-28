 interface InterfaceInheritance1 {
    void methodA();
}
interface  InterfaceInheritance2 {
    void methodB();
}
public interface InnerInterfaceInheritance3 extends InterfaceInheritance1,InterfaceInheritance2{
    void methodC();
}
class classInterface implements InnerInterfaceInheritance3{
    public void methodA(){
        System.out.println("It is method 1");
    }
    public void methodB(){
        System.out.println("It is method 2");
    }
    public void methodC(){
        System.out.println("It is method 3");
    }
}
class InheritancePrint{
    public static void main(String[] args) {
        classInterface i1= new classInterface();
        i1.methodA();
        i1.methodB();
        i1.methodC();
    }
}


