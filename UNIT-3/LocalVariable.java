public class LocalVariable {
    
    public static void main(String[] args) {
    //     var num = 10;
    //     System.out.println(num);
    // }
    // int add(int  a, int  b){
    //     var result= a+b;
    //     return result;

    // }
   
    var Str= new String[4];
    Str[0]="Kartikey";
    Str[1]="Rohit";
    Str[2]= "Aman";
    Str[3]= "Aditya";
    for(var varStr:Str){
        System.out.println(varStr);
    }
    // String[] Str={"Kartikey","Rohit","Aditya","Izazul","Aman"};
    // for(var i=0;i<=4;i++){
    //     System.out.println(Str[i]);
    // }
}
}
