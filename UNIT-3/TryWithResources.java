import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class TryWithResources {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("SampleWorks.txt");
        FileOutputStream fos = new FileOutputStream("SampleWorksCopy.txt")){
            int read = fis.read();
            while(read!= -1){
                fos.write(read);
                read= fis.read();
            }
        }
        catch(IOException ie){
            System.out.println(ie);
        }
    }
    
}
