package carRent;

public class Rent {
  protected float days;
  protected float u_days;
  protected float total_price;
  public String date;

  public void newRent(float rent_days, float rent_price, String date_taken) {
    days = rent_days;
    u_days = days;
    total_price = (rent_days * rent_price);
    date = date_taken;
  }

  public void update(float days_passed) {
    u_days -= days_passed;
    if (u_days <= 0) {
      endRent();
    }
  }

  public void fetch() {
    System.out.println("Days Taken for: " + days);
    System.out.println("Days Remaining: " + u_days);
    System.out.println("Price paid: " + total_price);
    System.out.println("Date Taken: " + date);
  }

  public void endRent() {
    System.out.println("Rent has Ended");
    System.out.println("Rented on " + date + "\nDays Passed: " + days);
  }
}