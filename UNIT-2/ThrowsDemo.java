public class ThrowsDemo {
    public static void method() throws IllegalAccessException{
        System.out.println("Start");
        throw new IllegalAccessException("Illigal Access !");
    }
    public static void main(String[] args) {
        try{
            method();
            
        }
        catch(IllegalAccessException iae){
            System.out.println(iae.getMessage());
        }
    }
}
