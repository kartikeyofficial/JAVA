class Accessing {
    protected int a=10;  /*  (Protected)when you use the Protected Specifiers then you can directly Acces the varible data.
                             Just like you can easily 
                             System.out.println(a);
                            (Private)and In private Specifier you can not directly Access the data 
                             you can use the method then you Access the data like
                             System.out.println(getA());

                           */
    int getA(){
        return a;
    }
}
class AccessingMain extends Accessing{
    void Display() {
        System.out.println(a);
    }
}
class AccessDemo{
    public static void main(String[] args) {
        AccessingMain obj = new AccessingMain();
        obj.Display();
    }
    
}
