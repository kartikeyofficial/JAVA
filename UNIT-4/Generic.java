import java.security.PublicKey;

public class Generic<T>{
    private T value;
    public void setter(T value){
        this.value= value;
    }
    public T Getter(){
        return value;
    }
    
}
class GenericDemo{
    public static void main(String[] args) {
        Generic<Integer> ObjInt= new Generic<Integer>(); 
        Generic<String> ObjStr= new Generic<>();

        ObjInt.setter(73);
        System.out.println(ObjInt.Getter());

        ObjStr.setter("Kartikey");
        System.out.println(ObjStr.Getter());

    }
}
