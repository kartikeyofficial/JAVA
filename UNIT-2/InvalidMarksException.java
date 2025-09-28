class InvalidMarksException extends Exception {
String describe;
InvalidMarksException(String detail){ // Make A constructor With string Argument!
    super(detail);
    describe= detail;
}
public String toString(){
    return " Custom Exception "+describe;
}
    
}
class CustomExceptionDemo{
    public static void main(String[] args) throws InvalidMarksException{
        int marks=-1;
        try{
        if(marks<0){
            throw new InvalidMarksException(" You Have Negative Marks In Your Exam! ");
        }
        else{
            System.out.println("Marks: "+marks);
        }
        
    }
    catch(InvalidMarksException ime){
        System.out.println("Marks: "+ime);
        System.out.println("Message: "+ime.getMessage());
        System.out.println("Trace The exception Place: ");
        ime.printStackTrace();
    }
    }
}
