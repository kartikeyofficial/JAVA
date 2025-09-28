public class Kartikey {
    private int a=10;
    private int b=20;
    public void setA (int a){
        this.a = a;
    }
    public int getA(){
        return a;
    }
    public void setB(int b){
        this.b=b;

    }
    public int getB(){
        return b;
    }

}
class KartikeyMain{
    public static void main(String[] args) {
        Kartikey k1= new Kartikey();
        System.out.println(k1.getA());
        System.out.println(k1.getB());
        
    }
}