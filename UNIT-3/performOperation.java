interface IMathOps {
    double doOp(double num);
}
class performOperation(IMathOps ref, double n){
    static double square (double num){
        return num*num;
    }
    static double performOperation(IMathOps ref, double n){
        return ref.doOp(n);
    }
    public static void main(String[] args) {
        double resultSqrt, resultCbrt, resultSquare;
    }
}
