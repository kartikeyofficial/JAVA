 class MyClass {
    
   int a;
   int b;
   int add(){
    return (a+b)/2;
   }
    }
    

class MainMethodeClass
{
    public static void main(String args[] ){
        MyClass obj= new MyClass();
        obj.a=10;
        obj.b=2;
        System.out.println("Perameter Of The Rectangle= "+obj.add());         // calling the function
    }
}
