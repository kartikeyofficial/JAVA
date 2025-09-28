public class Inheritance1 {
    int a;
    int b;
    int add (int a, int b){
        return a+b;
    }
    int mul(int a, int b){
        return a*b;
    }
    
}
class Saurabh extends Inheritance1{
    int num(int a, int b){
        super(a,b);
    }

    int add () {
        return a+b;
    }

}
class Rohit{
    public static void main(String[] args) {
        Saurabh s1 = new Saurabh();
        System.out.println("Adition of two Numbers:"+s1.add(10, 30));
        System.out.println("Multiplication of two number: "+s1.mul(2, 2));
        System.out.println("Adddition three Numbers: "+s1.num(10, 20, 30));

        
    }
}
