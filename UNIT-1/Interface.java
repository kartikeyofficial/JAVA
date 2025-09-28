package pack.example.myfile;
public interface Interface {
    int add(int a , int b);
    int multiply(int a , int b);
}
class ClaInterface implements Interface{
    public int add(int a, int b){
        return a+b;
    }
    public int multiply(int a , int b){
        return a*b;
    }
    int sub(int a, int b){
        return a-b;
    }
}
class SolveInterface extends ClaInterface{
    public int multiply(int a, int b){
        return a*b;
    }
}
class InterfaceMain{
    public static void main(String[] args) {
        //SolveInterface c1= new SolveInterface();
        ClaInterface c1= new ClaInterface();
        System.out.println(c1.add(10, 20));
        System.out.println(c1.multiply(10, 20));
        System.out.println(c1.sub(10, 10));
    }
}
