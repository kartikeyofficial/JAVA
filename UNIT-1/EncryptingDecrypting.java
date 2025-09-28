public class EncryptingDecrypting {
    public static void main(String[] args) {
        // Encryting
        char grade='B';
        grade= (char)(grade+8); // Casting DataType from One Data Type To Another DataType
        System.out.println(grade);

        //Decrypting
        grade=(char)(grade-8);
        System.out.println(grade);
    }
}
