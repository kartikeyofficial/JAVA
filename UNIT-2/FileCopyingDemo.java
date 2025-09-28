import java.io.*; 

class FileCopyingDemo {
    public static void main(String[] args)throws FileNotFoundException,IOException {
        FileReader fis= new FileReader("sample.txt");
        FileWriter fos= new FileWriter("sampleCopy.txt");

        int ch;
        ch= fis.read();
        while(ch!=-1){
            fos.write(ch);
            ch=fis.read();
        }
        fis.close();
        fos.close();
    
    }
}
