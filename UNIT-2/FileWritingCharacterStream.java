import java.io.*;
public class FileWritingCharacterStream {
   public static void main(String[] args) throws FileNotFoundException,IOException{
    FileWriter fw = new FileWriter("sample.txt");
    fw.write(65);
    fw.write(66);

    char[] chars1= {'C','D','E','F'};
    System.out.println(new String(chars1));
    fw.write(chars1);
   
    char[] chars2= {'G','H','I','J','K','L','M','N'};
    System.out.println(new String(chars2));
    fw.write(chars2,2,4);

    String str= "Meerut";
    fw.write(str);

    str="The Java Language";
    fw.write(str,2,4);
    fw.close();
    fw= new FileWriter("sample.txt",true);
    fw.append("Q");
    fw.append("PYTHON");
    fw.append("The PYTHON Language",11,19);
    fw.append("JavvaScript").append("C++").append("C#");

    StringBuilder stringBuilder= new StringBuilder("LISP");
    fw.append(stringBuilder);
    fw.close();

     


    
   } 
}
