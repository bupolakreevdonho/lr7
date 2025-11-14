package lr1;

import java.util.Scanner;

public class Example6 {

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input last: ");
        String last = in.nextLine();

        System.out.println("Input first: ");
        String first = in.nextLine();

        System.out.println("Input middle: ");
        String middle = in.nextLine();

        System.out.println("Hello " + last + ", " + first + ", " + middle);
        in.close();
    }
}
