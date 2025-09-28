public interface InterfaceReference {
    int add(int a, int b);
} 
class Reference1 implements InterfaceReference{
    public int add(int a, int b){
        return a+b;
    }
}
class Reference2 implements InterfaceReference{
    public int add(int a, int b){
        return a*a+b*b;
    }

}
class InterfaceCall {
    public static void main(String[] args) {
        InterfaceReference ref;
        Reference1 r1= new Reference1();
        Reference2 r2= new Reference2();
        ref = r1;
        System.out.println("Addition of two numbers:"+ref.add(10, 20));
        ref = r2;
        System.out.println("Additio of Two Numbers: "+ref.add(10, 20)); 
    }
}

    

