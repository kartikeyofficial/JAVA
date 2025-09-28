import java.util.Scanner;
public class MethodCallStackdemo {
    public static void main(String[] args) {
        System.out.println("Enter Main");
        Scanner x= new Scanner(System.in);
        int divisor= x.nextInt();
        
        
        methodeA(divisor);
        System.out.println("Exit main()");
    }
    public static void methodeA(int divisor){
        System.out.println("Enter MethodA()");
        methodB(divisor);
        System.out.println("Exit MethodeA()");
    }
    public static void methodB(int divisor){
        System.out.println("Enter The MethodB()");
        methodC( divisor);
        System.out.println("Exit MethodB()");
    }
    public static void methodC(int divisor){
        System.out.println("Enter The MethodC()");
        methodD( divisor);
        System.out.println("Exit MethodC()");
    }
    public static void methodD(int divisor){
        System.out.println("Enter MethodD()");
        int num =20;
        int result=0;
        try{
        result = num/divisor;
        }
        catch(ArithmeticException as){
            System.out.println("Give the right Divisor ! Please Give Greater Than 0");
        }
        
        System.out.println("20/"+divisor+" = "+result);
        System.out.println("Exit methodD()");

    }
}
