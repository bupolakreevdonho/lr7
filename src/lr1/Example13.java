package lr1;

import java.util.Scanner;

public class Example13 {

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input the first number");
        int s = in.nextInt();

        System.out.println("Input the second number");
        int d = in.nextInt();

        int sum = s + d;

        System.out.println("Sum: " + sum);
        in.close();
    }
}
