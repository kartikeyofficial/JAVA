 import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
@Target(ElementType.TYPE_USE)
@interface TypeAnnotation{
    String value();
}
class MyClasses {
    @TypeAnnotation("Variable Type") int attr;
    MyClasses(int attr){
        this.attr= attr;
    }
    @TypeAnnotation("Return Type") int sum(int num){
        return attr*num;
    }
    
}
class TypeAnnotationDemo{
    public static void main(String[] args)throws @TypeAnnotation("Throws Annotation")InterruptedException {
        MyClasses m1= new @TypeAnnotation("Class Type") MyClasses(10);
        System.out.println(m1.sum(5));
        
    }
}
