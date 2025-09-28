public class Static {
    private int length;
    private int width;
    static int ObjectCount;// static Data Member

    static {     // Static Block code
        System.out.println("Rectangle class is Loaded");
        ObjectCount=0;
    }
    static void showObjectCount(){   //Static Member Method 
        System.out.println("Count of Rectangle Objects:"+ObjectCount);
    }
    Static(){  //we USe The Constructors  (Static is the Class Name There)
          length= 2; // Default Constructor
          width = 2;
          ObjectCount++;
    }
    Static(int length, int width){   // Argument Constructor
        this.length=length;
        this.width=width;
        ObjectCount++;
    }
    Static(int dim){
        this.length= dim;
        this.width= dim;
        ObjectCount++;
    }


    public void setLength(int len){  // use The Methods
        length = len;
    }
    public int getLength(){
        return length;
    }
    public void setWidth(int wid){
        width= wid;
    }
    public int getWidth(){
        return width;
    }
    public int area(){
        return length*width;
    }


}
class StaticMain{
    public static void main(String[] args) {
        Static r1= new Static(); // Object No.1
        System.out.println("Length of r1:"+r1.getLength());
        System.out.println("Width of r1:"+r1.getWidth());
        System.out.println("Area of r1:"+r1.area());
        Static.showObjectCount(); // Call The Static Member Method using [ClassName.StaticMethod();]

        Static r2= new Static(5,6); // Object No.2
        System.out.println("Length of r2:"+r2.getLength());
        System.out.println("Width of r2:"+r2.getWidth());
        System.out.println("Area of r2:"+r2.area());
        Static.showObjectCount();


        Static r3= new Static(7);  // Object No.3
        System.out.println("Length of r3:"+r3.getLength());
        System.out.println("Width of r3:"+r3.getWidth());
        System.out.println("Area of r3:"+r3.area());
        Static.showObjectCount();


    }
    
}
