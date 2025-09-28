sealed class SealedDemo permits Student1, Student2,Student3{
    void Display(){
        System.out.println("SealedDemo is the super Class");
    }
    
}
final class Student1 extends SealedDemo{
    void Display(){
        System.out.println("Student 1 is the subClass Of The SealedDemo");
    }

} 
non-sealed class Student2 extends SealedDemo{
    void Display(){
        System.out.println("Student2 is the Non-Sealded Class");
    }
}
sealed class Student3 extends SealedDemo permits Student4{
    void Display(){
        System.out.println("Student# Class Is sealded and Sealded inherit with SealdDemo");
    }
    
}
final class Student4 extends Student3{
    void Display(){
        System.out.println("Student4 is final Class inherited By the Student3 ");
    }
}

class SealedClassDemo{
    public static void main(String[] args) {
        SealedDemo seal= new SealedDemo();
        Student1 s1= new Student1();
        Student2 s2= new Student2();
        Student3 s3= new Student3();
        Student4 s4= new Student4();

        seal.Display();
        s1.Display();
        s2.Display();
        s3.Display();
        s4.Display();
    }
}
