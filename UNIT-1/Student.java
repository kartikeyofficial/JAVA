public class Student {
    String name;
    int age;
    int rollNumber;
    void study(){
        System.out.println(name+" is Studying:");

    }
    void takeExam(){
        System.out.println(rollNumber+" is taking an exam:");
    }
    
}
class MainClass
{
    public static void main(String[] args){
        Student obj1;
        obj1= new Student();
        obj1.name="Kartikey";
        obj1.rollNumber=73;
        obj1.age=20;

        obj1.study();
        obj1.takeExam();
        Student obj2=new Student();

    obj2.name="Mayank";
    obj2.rollNumber=101;
    obj2.age=22;
    obj2.study();
    obj2.takeExam();
}


    }
   
 