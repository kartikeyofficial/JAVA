import java.util.Scanner;
public class ExceptionHandlingDemo{
    public static void main(String[] args) {
        int num=20;
        Scanner x= new Scanner(System.in);
        int n= x.nextInt();
        int result=(num/n);

        
        System.out.println("Result od the Devide: "+ result);
    }
}