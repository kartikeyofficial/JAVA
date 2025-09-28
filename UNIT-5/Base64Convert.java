import java.util. Base64;
public class Base64Convert {
    public static void main(String[] args) {
        String sample= "LEMON";
        System.out.println("Sample String:"+sample);
        String ByteConvert= Base64.getEncoder().encodeToString(sample.getBytes());
        System.out.println("Base64 is: "+ByteConvert);
        byte[] bytes = Base64.getDecoder().decode(ByteConvert);
        String string = new String(bytes);
        System.out.println("Original Data: "+string);
        
    }
}
