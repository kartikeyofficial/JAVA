public class MathOps {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return(a+b+c);
    }
    
}
class MathOpsMain{
    public static void main(String[] args){
        MathOps obj=new MathOps();
        System.out.println(obj.add(3,4));
        System.out.println(obj.add (3,4,5));
    }
}
