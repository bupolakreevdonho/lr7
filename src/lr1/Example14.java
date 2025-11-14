package lr1;

import java.util.Scanner;

public class Example14 {

    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input number: ");

        int x = in.nextInt();

        int a = x - 1;
        int b = x;
        int c = x + 1;
        int sumFirstThree = a + b + c;
        int d = sumFirstThree * sumFirstThree;

        System.out.println(a + " " + b + " " + c + " " + d);
        in.close();
    }
}
