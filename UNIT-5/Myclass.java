import java.lang.annotation.*;
@interface ClassAnnotation{
    int noFields();
    int noMethode();
    int noConstructor();

}
@ClassAnnotation(noFields = 1,noConstructor = 1, noMethode = 2)
class Myclass {
    int attr1;
    int att2;
    public Myclass(int attr1, int attr2){
        this.attr1= attr1;
        this.att2= attr1;
    }
    public void display(){
        System.out.println(attr1+":"+att2);
    }
    
}
class MyClassAnnotation{
    public static void main(String[] args) {
        Myclass m1= new Myclass(34, 45);
        m1.display();
    }
}

