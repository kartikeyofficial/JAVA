import java.io.*;
public class FileMaintain {
    public static void main(String[] args) throws IOException{
        File directory2=new File("//home//kartikey//FileHandling//dir2");
        File text= new File(directory2,"demoFile.txt"); //Creating object of File Class.
        File javaDirectory=new  File(directory2,"javaDirectory");

        System.out.println(directory2.exists());
        System.out.println(text.exists());
        System.out.println(javaDirectory.exists());
        System.out.println(text.isFile());
        System.out.println(text.isDirectory());
        System.out.println(text.canRead());
        System.out.println(text.canWrite());
        System.out.println(text.getName());
        System.out.println(text.getPath());
        System.out.println(text.length());
        File newFileManager= new File(directory2,"NewFileManager.txt");
        System.out.println(newFileManager.createNewFile());
        
        File newDirectory = new File(directory2,"NewDirectory");
        System.out.println(newDirectory.mkdir());

        for(String Names:directory2.list()){
            System.out.println(Names);
        }

    }
    
}
