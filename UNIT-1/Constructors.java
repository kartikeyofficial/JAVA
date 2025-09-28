public class Constructors {
    private int length;
    private int width;
    
    public Constructors(){
       length=1;
        width=1;

    }
    public Constructors(int length, int width){ /// two -Arguments Constructor(Specific Values)
        this.length=length;
        this.width=width;
    }
    public Constructors(int dimension){ // one argument constructor (square case)
        this.length=dimension;
        this.width=dimension;
    }
    public void setLength(int len){
        length= len;
    }
    public int getLength(){
        return length;
    }
    public void setWidth(int wid){
        width=wid;
    }
    public int getWidth(){
        return width;
    }

    int area(){
        return length*width;
    }

}
class ConstructorsMain{
    public static void main(String[] args){
    Constructors r1= new Constructors();
    System.out.println("Length of r1:"+r1.getLength());
    System.out.println("Length of r1:"+r1.getWidth());
    System.out.println("Area of r1:"+r1.area());
    
    Constructors r2= new Constructors(5,6);
    System.out.println("Length of r2:"+r2.getLength());
    System.out.println("Width of r2:"+r2.getWidth());
    System.out.println("Area Of r2:"+r2.area());
    
    Constructors r3= new Constructors(7);
    System.out.println("Length of r3:"+r3.getLength());
    System.out.println("Width of r3:"+r3.getWidth());
    System.out.println("Area Of r3:"+r3.area());
    }

}
