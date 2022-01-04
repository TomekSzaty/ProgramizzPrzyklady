package arrays;

public class DwuWymiarowaTablica {
    public static void main(String[] args) {

        int[][] matrix = {
                {4, 8, 2, 5},
                {14, 17, 19, 25, 34},
                {2, 0, 6}
        };
        for (int[] inner : matrix
             ) {
            for (int number: inner
                 ) {
                System.out.print(number + " ,");

            }
        }
    }
}
