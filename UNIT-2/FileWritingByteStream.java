import java.io.*;
public class FileWritingByteStream {
    public static void main(String[] args)throws FileNotFoundException,IOException {
        FileOutputStream fos= new FileOutputStream("sample.txt");
        fos.write(65);
        fos.write(66);

        byte[] bytes1 = {67,68,69,70};
        System.out.println(new String(bytes1));
        fos.write(bytes1);
        byte[] bytes2= {71,72,73,74,75,76,77,78};
        System.out.println(new String(bytes2));
        fos.write(bytes2,2,4);
        fos.close(); 

        fos= new FileOutputStream("sample.txt",true);//append mode  
       fos.write(bytes2,6,2); 
       fos.close();

        
    }
}
