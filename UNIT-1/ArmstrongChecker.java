
    import java.util.Scanner;

public class ArmstrongChecker {
   public ArmstrongChecker() {
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int number = scanner.nextInt();
      int originalNumber = number;
      int result = 0;

      for(int digits = String.valueOf(number).length(); number != 0; number /= 10) {
         int digit = number % 10;
         result = (int)((double)result + Math.pow((double)digit, (double)digits));
      }

      if (result == originalNumber) {
         System.out.println("" + originalNumber + " is an Armstrong number.");
      } else {
         System.out.println("" + originalNumber + " is NOT an Armstrong number.");
      }

      scanner.close();
   }
}


