class Rectang {
    int length;
    int breadth;
    public Rectang(int length, int breadth){
        this.length= length;
        this.breadth=breadth;
    }
    public int area(){
        return length*breadth;
    }
}
class Cuboid extends Rectang{
    public int height;
    public Cuboid(int length, int breadth, int height){
        super(length,breadth);
        this.height= height;

    }
    int CalculateVolume(){
        return length*breadth*height;

    }

}
class MainReactang{
    public static void main(String[] args) {
        Rectang r1= new Rectang(10, 20);
        System.out.println("Area Of Rectangle:"+r1.area());
    
       Cuboid r2= new Cuboid(10, 20, 30);
       System.out.println("Volume of Cuboid:"+r2.CalculateVolume());

    }
    
}

