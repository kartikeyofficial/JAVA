import java.io.IOException;

public class CheckedDemo {
    public static void myMethod() throws IOException{
        throw new IOException();
    }
    public static void main(String[] args){ //throws IOException{
    try{
        myMethod();
    }    
    catch(IOException io){
        System.out.println(io);

    }
    }
}
