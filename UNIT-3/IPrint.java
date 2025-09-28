interface IPrint {
    void doPrint(String str);
    
}
class InstanceMethodRedDemo{
    void printTriple(String str){
        System.out.println(str+" & "+str+" & "+str);

    }
    static void doPrintOperation(IPrint ref, String str){
        ref.doPrint(str);
    }
    public static void main(String[] args) {
        doPrintOperation(System.out::println,"Ghaziabad");
        doPrintOperation(System.out::println,"Delhi");
        InstanceMethodRedDemo obj= new InstanceMethodRedDemo();
        doPrintOperation(obj::printTriple,"Meerut");
    }
}
