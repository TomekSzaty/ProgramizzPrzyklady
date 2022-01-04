package loops;

import java.util.Scanner;

public class ObliczanieSumyPodanychLiczb {
    public static void main(String[] args) {

        Double number, sum = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Ten program obliczy sumę dodatnich liczb podanych przez Ciebie :");
        for (int i = 0; i < 6; ++i) {
            System.out.print("Enter Number " + i + " : ");
            number = input.nextDouble();
            if (number <= 0.0) {
                continue;
            }
            sum += number;
        }
        System.out.println(" The Sum is equal = " + sum);
        input.close();
    }
}
