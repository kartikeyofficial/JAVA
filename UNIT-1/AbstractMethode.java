abstract class AbstractMethode {
    abstract void displayArea();
    
}
class Square extends AbstractMethode{
    int length;
    int breadth;
    Square(int length, int breadth){
        this.length= length;
        this.breadth=breadth;
    }
    @Override 
    void displayArea(){
        int area= length*breadth;
        System.out.println("Area Of Square is: "+area);
    }
}
class SquareMain{
    public static void main(String[] args) {
        //AbstractMethode refrence;
        Square s1= new Square(20, 20);
        //refrence= s1;
        s1.displayArea();
    }
}
