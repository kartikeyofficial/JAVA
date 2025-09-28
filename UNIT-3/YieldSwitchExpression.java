import java.util.Scanner;
public class YieldSwitchExpression {
    public static void main(String[] args) {
        System.out.print("Enter The Day Number:");
    Scanner x= new Scanner(System.in);
    int day = x.nextInt();
    String dayOfWeek = switch(day){
        case 1,2,3,4,5 -> {
            System.out.println("We Have Five days Of Working");
            yield "Working Days";

        }
        case 6,7 -> {
            System.out.println("We Have Two days Of Off 'Holidays'");
            yield "Holidays";
        }
        default -> "! Invalid Data";
    };

    } 
}
