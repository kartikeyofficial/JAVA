public class Rectangle {
    public int length;
    public int breadth;   // when you use the private Acess Specifier the the output it gives the length/breadth is not visible.
    int area(){
        return length*breadth;
    }
    

}
class TriangleArea{
    public static void main(String[] args){
        Rectangle r1= new Rectangle();
        Rectangle r2=new Rectangle();
        Rectangle r3= new Rectangle();
        r1.length=10;
        r1.breadth=7;
        r2.length=20;
        r2.breadth=12;
        r3.length=15;
        r3.breadth=10;
        System.out.println("Area Of Rectangle1="+r1.area());
        System.out.println("Area Of Rectangle2="+r2.area());
        System.out.println("Area Of Rectangle3="+r3.area());

    }
}
