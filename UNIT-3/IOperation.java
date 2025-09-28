interface IOperation {
    int myOperation(int a);
}

class LamdaExpressionDemo
{
    public static void main(String[] args) {
        
        IOperation ref = a ->  a*a;
        System.out.println(ref.myOperation(3));

        ref =a->a*2;
        System.out.println(ref.myOperation(3));
    }
}
