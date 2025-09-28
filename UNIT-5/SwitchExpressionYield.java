import java.util.Scanner;
class SwitchExpressionYield {
    public static void main(String[] args) {
        System.out.print("Enter The Day Number: ");
        Scanner x= new Scanner(System.in);
        int day= x.nextInt();
        
        String dayofweek= switch(day){
            case 1,2,3,4,5 -> {
                System.out.println("We Have Five Day OF Working!");
            yield "Working Day.";
        }
            case 6, 7 -> {
            System.out.println("We Have Off Day on Two Days in a Week!");
            yield "Off Day";
        }
            default ->"Invalid Day!"; 
        };
        System.out.println(day+":"+dayofweek);
    }
    
    
}
