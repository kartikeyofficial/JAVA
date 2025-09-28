import java.util.Base64;
import java.util.Scanner;
class Base64EncodeDecode {
    public static void main(String[] args) {
        //Base64.Encoder encoder= Base64.getEncoder();
       // Base64.Decoder decoder= Base64.getDecoder();
       System.out.print("Enter The String: ");
        Scanner x = new Scanner(System.in);
        String input= x.nextLine();
        //String encodedOutput= encoder.encodeToString(input.getBytes());
        String encodedOutput= Base64.getEncoder().encodeToString(input.getBytes());
        System.out.println("Encoded Output: "+encodedOutput);
        //byte[] bytes = decoder.decode(encodedOutput);
        byte[] bytes = Base64.getDecoder().decode(encodedOutput);
        String string = new String(bytes);
        System.out.println("Original Data: "+string);
    }
    
}
