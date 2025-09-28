 class UserDefinedException extends Exception {
    String desc;
    UserDefinedException(String message){
        super(message);
        desc= message;

    }
    public String toString(){
        return" Custom Exception "+desc;
    }

}
