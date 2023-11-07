import java.util.Scanner;

public class Accenture1 {
    // Function to calculate the sum of squares
    public static long sumOfSquares(int N) {
        long sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += (long) i * i;
        }
        return sum;
    }

    // Function to calculate the square of the sum
    public static long squareOfSum(int N) {
        long sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        return sum * sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // Read N for each test case

            // Calculate the sum of squares and square of sum
            long sumSquares = sumOfSquares(N);
            long squareSum = squareOfSum(N);

            // Calculate the absolute difference
            long difference = Math.abs(sumSquares - squareSum);

            // Print the result for this test case
            System.out.println(difference);
        }
    }
}
