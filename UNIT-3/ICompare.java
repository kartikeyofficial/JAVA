interface ICompare {
    String doCompare(int a, int b);
    
}
class BlockLambdaDemo{
    public static void main(String[] args) {
        ICompare compareNumbers=(a,b)->{
            if(a>b){
                return a +" is greater than " +b;
            }else if(a<b){
                return a+ " Is less Than "+ b;
            }
            else{
                return a +" is equal to "+ b;
            }
        };
        System.out.println(compareNumbers.doCompare(10, 20));
    }
}
