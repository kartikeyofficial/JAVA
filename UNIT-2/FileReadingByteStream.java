import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingByteStream {
    public static void main(String[] args) throws FileNotFoundException,IOException{
        FileInputStream fis= new FileInputStream("sample.txt");
        
        System.out.println("Available Bytes: "+fis.available());
        int byteread = fis.read();
        System.out.println((char)byteread);
        byteread= fis.read();
        System.out.println((char)byteread);
        byteread= fis.read();
        System.out.println((char)byteread);
        System.out.println("Available: "+fis.available());
        
        byte[] fourBytesRead = new byte[4];
        fis.read(fourBytesRead);
        System.out.println(new String(fourBytesRead));

        System.out.println("Available Bytes: "+fis.available());

        fis.skip(2);
        fis.read(fourBytesRead);
        System.out.println(new String(fourBytesRead));

        fis.read(fourBytesRead,2,2);
        System.out.println(new String(fourBytesRead));
        
        fis.read(fourBytesRead,0,2);
        System.out.println(new String(fourBytesRead));

        byte[] twoByteRead= fis.readNBytes(2);
        System.out.println(new String(twoByteRead));

        twoByteRead = new byte[2];
        fis.readNBytes(twoByteRead,0,2);
        System.out.println(new String(twoByteRead));

        byte[] allBytesRead= fis.readAllBytes();
        System.out.println(new String(allBytesRead));

        System.out.println("Available Bytes: "+fis.available());
        
        System.out.println(fis.read(fourBytesRead,2,2));
        System.out.println(fis.readNBytes(fourBytesRead,0,2));
        
    }
    
}
