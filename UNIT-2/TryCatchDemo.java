import java.util.Scanner;
public class TryCatchDemo {
    public static void main(String[] args) {
        int result=0;
        Scanner x= new Scanner(System.in);
        int divident= x.nextInt();
        int divisor= x.nextInt();
        try{
            result= divident/divisor;
        }
        catch(ArithmeticException ae){
            System.out.println("The second Command Line Argument can not be zero");


        }
        catch(ArrayIndexOutOfBoundsException aioobe){
            System.out.println("Please Check the Both Divident and Divisor As Well As !");
        }
        finally{
            System.out.println("Releasing Resouces!");
        }
        System.out.println("Result="+result);

    }
}
