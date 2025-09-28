public class StringType1 {
    public static void main(String[] args) {
        
   String s= "Hello";
   s=s+ " World";
   String str1 = new String();// Empty Object In String
   str1= s;
   System.out.println(str1.length()); // Find The Length using .length() method
   System.out.println(str1.charAt(2));// for Indexing
   System.out.println(str1); 
   String str2 = new String("Kumar Kartikey");// Using Constructor
   System.out.println(str2);

   char[] arr= {'p','u','n','e'}; // Using Array
   String str3= new String(arr);
   System.out.println(str3);

   byte[] bytearr= {65,66,67,68}; // Using ASCII Code
   String str4= new String(bytearr);
   System.out.println(str4);

   String str5= new String(str3);// Existing Calling 
   System.out.println(str5);

   String str6= new String("Kartikey");
   System.out.println(str6.substring(0, 6));// find out the SubString

   String str7 = new String("Kartikey"); 
   System.out.println(str7.toUpperCase());
   System.out.println(str7.toLowerCase());

   String s3= ("JAVA");
   String s4= new String(s3);
   System.out.println(s3.equals(s4)); // for Checking String are Equals Are Not.

   String s1= "JAVA";
   String s2= "java";
   System.out.println(s1.equals(s2));
   System.out.println(s1.equalsIgnoreCase(s2));

   String s5= "HelloWorld";
   System.out.println(s5.startsWith("Hello"));
   System.out.println(s5.endsWith("World"));

   String str8 = "  java  ";
   System.out.println(str8.length());
   System.out.println(str8.trim()); //Reduce the Spaces.
   System.out.println(str8.trim().length()); // Length  After The Trim .

   String str9= "Apple";
   System.out.println(str9.replace('p', 'q'));
   
    }
}
