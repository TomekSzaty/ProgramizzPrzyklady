package arrays;

public class ObliczanieSredniejTablicyInt {
    public static void main(String[] args) {

        double[] grades = {5, 4.5, 3.7, 2.8, 3.6, 5.4};

        double total = 0.0;

        for (double grade : grades
        ) {
            total = total + grade;
        }
        double average = total / grades.length;

        System.out.println("Average grade = " + String.format("%,.2f", average));
    }
}
