public class Sum {
    public float a;
    public float b;
    public Sum(float a, float b){
        this.a=a;
        this.b=b;

    }
    float Addition(){
        return a+b;
    }

}
class Multiplication extends Sum{
    public float c;
    public Multiplication(float a , float b,float c){
        super( a,b);
        this.c=c;
    }
    float Multi(){
        return a*b*c;
    }
}
 class SumMain{
    public static void main(String[] args) {
        Sum s1 = new Sum(11.467f,34.567f);
        System.out.println("Addition of Two Numbers:"+s1.Addition());
        
        Multiplication m1= new Multiplication(10.0f,20.0f,30.0f);
        System.out.println("Multiplication of these Numbers:"+m1.Multi());

    }
    

}
