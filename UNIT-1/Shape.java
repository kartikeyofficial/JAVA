public class Shape {
    void displayArea(){
        System.out.println("Area Of Rectangle is Undefined:");
    }
}
class Rectanglee extends Shape{
    int length;
    int breadth;
    Rectanglee(int length, int breadth){
        this.length= length;
        this.breadth= breadth;
    }
    @Override
    void displayArea(){
        int area= length*breadth;
        System.out.println("Area Of Rectangle: "+area);
    }
}
class ShapeMain{
    public static void main(String[] args) {
        Shape shape;
        Rectanglee r1= new Rectanglee(20, 10);
        shape=r1;
        shape.displayArea();
    }
}
