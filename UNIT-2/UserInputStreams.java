import java.io.*;
//import java.util.Scanner;
public class UserInputStreams {
    public static void main(String[] args)throws IOException  {
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
       // Scanner x= new Scanner(System.in);

        System.out.print("Enter your Name: ");
        //String name= x.nextLine();
        String name= br.readLine();
        System.out.println("Name: "+name);
        
    }
}
