interface GenericAnonymous<T> {
    T myMethod(T num);
    
}
public class GenericAnonymousDemo{
    public static void main(String[] args) {
        GenericAnonymous<Integer> g1= new GenericAnonymous<>(){
            public Integer myMethod(Integer n){
                return n*2;

            }
        };
        System.out.println(g1.myMethod(10));
    }
}
