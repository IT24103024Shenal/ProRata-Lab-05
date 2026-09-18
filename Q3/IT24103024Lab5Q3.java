import java.util.Scanner;

public class IT24103024Lab5Q3 {
    public static void main(String[] args) {
        final double ROOM_CHARGE_PER_DAY = 48000.0;
        final int MIN_DAY = 1;
        final int MAX_DAY = 31;
        final int LOW_DISCOUNT_DAYS = 3;
        final int HIGH_DISCOUNT_DAYS = 5;
        final double LOW_DISCOUNT_RATE = 0.10;
        final double HIGH_DISCOUNT_RATE = 0.20;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();
        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        if (startDate < MIN_DAY || startDate > MAX_DAY || endDate < MIN_DAY || endDate > MAX_DAY) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int daysReserved = endDate - startDate;

        double discountRate = 0;
        if (daysReserved >= HIGH_DISCOUNT_DAYS) {
            discountRate = HIGH_DISCOUNT_RATE;
        } else if (daysReserved >= LOW_DISCOUNT_DAYS) {
            discountRate = LOW_DISCOUNT_RATE;
        }

        double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY * (1 - discountRate);

        System.out.println();
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount);
    }
}