import java.lang.annotation.*;
@Target({ElementType.TYPE,ElementType.METHOD})
@interface DescriptionAnnotation{
    String value();
}
@Target (ElementType.TYPE)
@interface ClassAnnotation{
    int noFields();
    int noMethods();
    int noConstructors();
}
@DescriptionAnnotation("Class")
@ClassAnnotation(noFields =2, noMethods=2, noConstructors=1)
class AnnotationClass {
    int attr1;
    int attr2;
    AnnotationClass(int attr1,int attr2){
        this.attr1= attr1;
        this.attr2= attr2;
    }
    @DescriptionAnnotation("Method")
    void display(){
        System.out.println(attr1+ "  : " +attr2);
    }
    
}
class MyAnnotationClassDemo{
    public static void main(String[] args) {
        AnnotationClass c1= new AnnotationClass(23, 24);
        c1.display();
    }
}
