class Demo {
    
    private int a;
    private int b;


    public int getA(int a){
        return a;
    }
    public int getB(int b){
        return b;
    }
}
class Demo1{
    public static void main(String[] args) {
        Demo d1= new Demo();
        System.out.println(d1.getA(2));
        System.out.println(d1.getB(20));
    }
}
