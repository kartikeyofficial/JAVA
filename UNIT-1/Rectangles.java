public class Rectangles{
    private int length;
    private int width;
    public void setLength(int len){
        if(len>0)
        length=len;
        else{
            System.out.println("Invalid Value!");

        }
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

// Main method
    }
    class RectangleMain{
        public static void main(String[] args){
            Rectangles r1= new Rectangles();
            r1.setLength(4);
            r1.setWidth(3);
            System.out.println("Length of r1:"+r1.getLength());
            System.out.println("Width of r1:"+r1.getWidth());
            System.out.println("Area Of r1:"+r1.area());
        }
    }

    

