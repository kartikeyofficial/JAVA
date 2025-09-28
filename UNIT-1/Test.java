public class Test{
    private int num1;
    private int num2;
    public void setNum1(int num1){
        if (num1>0){
            this.num1=num1;
        }
        else{
            System.out.println("Input is invalid!");
        }
    }
    public int getNum1(){
        return num1;
    }
    public void setNum2(int num2){
        this.num2=num2;
    }
    public int getNum2(){
        return num2;
    }
    int add(){
        return num1+num2;
    }
}
class TestMain{
    public static void main(String[] args){
        Test r1= new Test();
        r1.setNum1(7);
        r1.setNum2(8);
        System.out.println("Num1 of r1:"+r1.getNum1());
        System.out.println("Num2of r1:"+r1.getNum2());
        System.out.println("Addition of r1:"+r1.add());


    }
}