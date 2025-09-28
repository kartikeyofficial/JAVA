public class Inheritance {
    int sup;
    void setSup(int sup){
        this.sup = sup;

    }
    int getSup(){
        return sup;
    }

}
class Sub extends Inheritance{ // use the Inheritance for extend Using More Attributes and Behaviour To it
     int sub;
     
    void setSub(int sub){
        this.sub = sub;

    }
    int getSub(){
        return sub;
    }

}
class InheritanceDemo{
    public static void main(String[] args) {
        Sub obj= new Sub();
        obj.setSub(98);
        System.out.println(obj.getSub());
        
        obj.setSup(34);
        System.out.println(obj.getSup());

    }
}
