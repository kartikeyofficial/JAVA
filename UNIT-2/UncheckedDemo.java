public class UncheckedDemo {
    public static void myMethod() throws NumberFormatException{
           throw new NumberFormatException();
    }
    public static void main(String[] args) {
        try{
            myMethod();
        }
        catch(NumberFormatException nfe){
            System.out.println(nfe);
        }
    }

    }

