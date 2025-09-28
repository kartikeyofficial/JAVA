interface IOperation  {
    // String dop(String str);
    int  doOperetion(int a);

    
}
class InstanceMethodeReference {
    // void doubleprintString(String str){
    //     System.out.println(str+" "+str);
    // }
    // static void printOperation(IOperation ref, String str){
    //     ref.dop(str);
    // }
    // public static void main(String[] args) {
    //     InstanceMethodeReference obj = new InstanceMethodeReference();
    //     System.out.println(System.out::print,"Kartikey");
    //     System.out.println(System.out::println,"Rohit Singh");
    //     System.out.println(obj::doubleprintString,"Harshit");

    // }
    public static void main(String[] args) {
        IOperation ref= a -> {return a*a;};
        System.out.println(ref.doOperetion(10));
    }
    
}
