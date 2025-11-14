package lr1;

import java.util.Scanner;

public class Example15 {

    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int s = in.nextInt();
        int d = in.nextInt();
        int sum = s + d;
        int diff = s - d;

        System.out.println("Sum: " + sum);
        System.out.println("Diff: " + diff);
        in.close();
    }
}
