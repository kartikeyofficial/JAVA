interface IOp {
    double doOperation(double num);

    
}
class StaticMethodRefDemo{
    static double doubleNum(double num){
        return num*2;
    }
    static double performOp(IOp ref,double num){
        return ref.doOperation(num);
    }
    public static void main(String[] args) {
        System.out.println(performOp(Math::sqrt, 16));
        System.out.println(performOp(Math::cbrt, 27));
        System.out.println(performOp(StaticMethodRefDemo::doubleNum,4));
    }
}