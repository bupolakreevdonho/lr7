package lr1;

import java.util.Scanner;

public class Example9 {

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input month (e. g., January): ");
        String month = in.nextLine().trim();

        System.out.print("Input days (e. g, 1): ");
        String days = in.nextLine().trim();

        System.out.println(month + " contains " + days + " days.");
        in.close();
    }
}
