import java.lang.annotation.*;
@Repeatable(Roles.class)
@interface Role{
    String value();
}
@interface Roles{
    Role[] value();
}
@Role("Admin")
@Role("Teacher")
@Role("Student")

class RepeatableAnnotation {
    public static void main(String[] args) {
        System.out.println("Repeatable Annotation demo");
    }
}
