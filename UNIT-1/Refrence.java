public class Refrence {
    void draw(){
        System.out.println("Drawing the shape:");
    }
}
class Rectangle extends Refrence{
    @Override
    void draw(){
        System.out.println("Drwaing The Rectangle:");
    }
}
class Circle extends Refrence{
    @Override
    void draw(){
        System.out.println("Draw The Circle:");
    }
}
class RefrenceMain{
    public static void main(String[] args) {
        Refrence Ref;          // Always You give the Refrence of the only that class  Current is Super 'or' Parent Class
        Refrence r1= new Refrence();
        Rectangle r2= new Rectangle();
        Circle r3= new Circle();
        Ref = r1;
        Ref.draw();
        Ref = r2;
        Ref.draw();
        Ref = r3;
        Ref.draw();
    }
}
