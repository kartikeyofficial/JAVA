public class ThrowDemo {
    public static void main(String[] args) {
        try{
            throw new NullPointerException("Object Reference Points to Null!");

        }
        catch(NullPointerException npe){
            System.out.println(npe.getMessage());
        }
    }
}
