class MyClass {
    final int att;
    MyClass(int att){
        this.att = att;

    }
    void MyMethode( final int param){
          final int  localVar=3;
    //      localVar=6;
    //      // att=7;
    //      //param=8;
    //      System.out.println("Local Var: "+localVar);
    //      System.out.println("Param: "+param);
    //      System.out.println("Arrtributez: "+att);
    }
}
class MySubClass extends MyClass{
    MySubClass(int att){
        super(att);
    }
    void MyMethode(int param){
        System.out.println(param);
        System.out.println(att);
    }
} 
class FinalMain{
    public static void main(String[] args) {
        MySubClass m1= new MySubClass(4);
        m1.MyMethode(38);
    }
}
