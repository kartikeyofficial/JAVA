import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileInput {
    public static void main(String[] args) {
        try
        ( FileInputStream fis= new FileInputStream("sample.txt");
        FileOutputStream fos= new FileOutputStream("CopySample.txt")){
            int read= fis.read();
            while(read != -1 ){
                fos.write(read);
                read= fis.read();
            }
        }
        catch(IOException io){
            System.out.println(io);
        }
    }
    
}
