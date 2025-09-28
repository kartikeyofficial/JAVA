
import java.util.Scanner;
public class MonthsNumber {
     public static void main(String[] args) {
        System.out.print("Enter The Month Number:");
        Scanner x= new Scanner(System.in);
        int num = x.nextInt();
        String months = switch (num){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "! Invalid Input";
        };
        System.out.println(num+" : "+months);


     }
    
}
