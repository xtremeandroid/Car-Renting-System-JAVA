import java.util.*;
import java.lang.*;
import carRent.Rent;

class Main {
  public static void main(String[] Args) {
    Scanner scan = new Scanner(System.in);
    Rent r=new Rent();
    int ch;
    do {
      System.out.println("\n1. New Rent\n2. Update Rent\n3. Current Status\n4. Exit\n Enter a choice: ");
      ch = scan.nextInt();
      switch (ch) {
      case 1:
      System.out.print("\033[H\033[2J");
System.out.flush();
        System.out.println("Enter Date Taken: ");
        String date_taken = scan.next();

        System.out.println("Enter price: ");
        float rent_price = scan.nextFloat();

        System.out.println("Enter the amount of days to be Rented: ");
        float rent_days = scan.nextFloat();

        r.newRent(rent_days, rent_price, date_taken);
        break;

      case 2:
        System.out.println("Enter Number of days passed: ");
        float days_passed = scan.nextFloat();

        r.update(days_passed);
        break;

      case 3:
        r.fetch();
        break;

      case 4:
        System.out.println("Exiting");
        break;

      default:
        System.out.println("Incorrect Choice");
        break;
      }
    } while (ch != 4);
  }
}