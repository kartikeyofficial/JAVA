import java.io.*;
public class FileDemo {
    public static void main(String[] args)throws IOException {
        File javaDir= new File("//home//kartikey//FileHandling");
        File file1= new File(javaDir,"file1.txt");
        File dir2 = new File(javaDir,"dir2");

        System.out.println(javaDir.exists());
        System.out.println(file1.exists());
        System.out.println(dir2.exists());

        System.out.println(javaDir.isFile());
        System.out.println(javaDir.isDirectory());

        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());

        System.out.println(file1.getName());
        System.out.println(file1.getPath());
        System.out.println(file1.length());

        File newFile= new File(javaDir,"newFile.txt");
        System.out.println(newFile.createNewFile());

        File newDir= new File(javaDir,"newDir");
        System.out.println(newDir.mkdir());

        System.out.println(newDir.delete());

       
        for(String name:javaDir.list()){
            System.out.println(name);
        }
    }
}
