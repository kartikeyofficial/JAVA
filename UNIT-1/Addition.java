public class Addition{
    private int a;
    private int b;
    static int Object;

    static{
        System.out.println("Addtion of two Numbers:");
        Object=0;
    }
    static void showObject(){
        System.out.println("Count of Addition:"+Object);
    }
    Addition(){
        a=10;
        b=20;
        Object++;
    }
    Addition(int a , int b){
        this.a=a;
        this.b=b;
        Object++;
    }
    Addition(int dim){
        this.a=dim;
        this.b=dim;
        Object++;
    }
    public void setA(int num1){
        num1=a;

    }
    public int getA(){
        return a;
    }
    public void setB(int num2){
        num2=b;
    }
    public int getB(){
        return b;
    }
    public int sum(){
        return a+b;
    }
    
}
class AdditionMain{
    public static void main(String[] args) {
        Addition r1= new Addition();
        System.out.println("Value Of r1 A:"+r1.getA());
        System.out.println("Value Of r1 B:"+r1.getB());
        System.out.println("Value Of r1 A:"+r1.sum());
        Addition.showObject();


         Addition r2= new Addition();
        System.out.println("Value Of r2 A:"+r2.getA());
        System.out.println("Value Of r2 B:"+r2.getB());
        System.out.println("Value Of r2 A:"+r2.sum());
        Addition.showObject();


         Addition r3= new Addition();
        System.out.println("Value Of r3 A:"+r3.getA());
        System.out.println("Value Of r3 B:"+r3.getB());
        System.out.println("Value Of r3 A:"+r3.sum());
        Addition.showObject();
    }
}
