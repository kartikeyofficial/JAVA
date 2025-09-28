public interface DefaultOperation {
    int SCALE_FACTOR = 3;
    int add(int a, int b);
    int multiply(int a, int b);

    default int scale(int a){
        return SCALE_FACTOR*a;
    }

    
} 
class defination implements DefaultOperation{
    public int add(int a, int b){
        return a+b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
}
class DefaultOperationMain{
    public static void main(String[] args) {
        defination d1= new defination();
        System.out.println(d1.add(10, 5));
        System.out.println(d1.multiply(10, 2));
        System.out.println(d1.scale(4 ));
    }
}

    

