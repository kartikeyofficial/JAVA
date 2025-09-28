import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
@interface TypeAnnotation{
    String value();

}
class MyClass {
    @TypeAnnotation("Variable Type")int attr;
    MyClass(int attr){
        this.attr= attr;
    }
    @TypeAnnotation("Return Type")int sum(int num){
        return attr+num;
    }
     
}
class TypeAnnotationDemo{
    public static void main(String[] args) throws @TypeAnnotation("throws ExceptionType")InterruptedException {
        MyClass m1=new @TypeAnnotation("Class Type") MyClass(4);
        System.out.println(m1.sum(6));


    }
}
