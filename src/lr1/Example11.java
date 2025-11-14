package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example11 {

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("name: ");
        String name = in.nextLine();

        System.out.println("Input the birthYear");
        int birthYear = in.nextInt();

        int currentYear = LocalDate.now().getYear();
        int age = currentYear - birthYear;

        System.out.println( name + ", Age: " + age);
        in.close();
    }
}
