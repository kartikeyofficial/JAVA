public class UserDefinedExceptionDemo {
    public static void main(String[] args) {
        try{
            throw new UserDefinedException(" A User DefinedException");

        }
        catch(UserDefinedException ude){
            System.out.println("Exception Object"+ude);
            System.out.println("Message:"+ude.getMessage());
            System.out.println("Stack Trace: ");
            ude.printStackTrace();
        }
    }
}
