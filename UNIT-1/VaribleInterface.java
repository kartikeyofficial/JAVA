public interface VaribleInterface {
  int SCALE_FACTOR=3;
  int add(int a, int b);
  int multiply(int a, int b);
  int scale(int a);

}
class Variable implements VaribleInterface{
    public int add(int a , int b){
        return a+b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int scale(int a){
        return a*SCALE_FACTOR;
    }
    int sub(int a, int b){
        return a-b;
    }
}
class VariableMain{
    public static void main(String[] args) {
        Variable v1 = new Variable();
        System.out.println("Addition of Two Numbers:"+v1.add(10, 5));
        System.out.println("Multiplication of Two Numbers:"+v1.multiply(20,10));
        System.out.println("Scalling of The Number: "+v1.scale(6));
        System.out.println("substraction of two Numbers:"+v1.sub(10, 2));
    }
}
