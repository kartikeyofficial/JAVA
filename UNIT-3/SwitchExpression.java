import java.util.Scanner;
public class SwitchExpression {
    public static void main(String[] args) {
        System.out.print("Enter The Day Number: ");
    Scanner x= new Scanner(System.in);
    int day= x.nextInt();
    
    String WeekDays= switch (day){
        case 1 -> "Sunday";
        case 2 -> "Monday";
        case 3 -> "Tuesday";
        case 4 -> "wednesday";
        case 5 -> "Thursday";
        case 6 -> "Friday";
        case 7 -> "Saturday";
        default -> "Invalid day";

    };
    System.out.println(day+" : "+WeekDays);
}
    
}
