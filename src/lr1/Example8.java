package lr1;

import java.util.Scanner;

public class Example8 {

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input day of week (e. g., Monday): ");
        String dayOfWeek = in.nextLine().trim();

        System.out.print("Input month (e. g., January): ");
        String month = in.nextLine().trim();

        System.out.print("Input DateStr (e. g, 1): ");
        String dateStr = in.nextLine().trim();

        System.out.println("Today: " + dayOfWeek + ", " + dateStr + " " + month);
        in.close();
    }
}
