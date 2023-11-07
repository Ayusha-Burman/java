import java.util.Scanner;

public class Accenture2 {
    public static int OperationsBinaryString(String str) {
        if (str == null) {
            return -1; // Return -1 for invalid input
        }

        int result = Character.getNumericValue(str.charAt(0)); // Initialize result with the first binary digit

        for (int i = 1; i < str.length(); i += 2) {
            char operation = str.charAt(i);
            char binaryDigit = str.charAt(i + 1);

            int digitValue = Character.getNumericValue(binaryDigit);

            if (operation == 'A') {
                result &= digitValue; // Perform AND operation
            } else if (operation == 'B') {
                result |= digitValue; // Perform OR operation
            } else if (operation == 'C') {
                result ^= digitValue; // Perform XOR operation
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the binary string: ");
        String input = scanner.nextLine();

        int result = OperationsBinaryString(input);
        System.out.println("Result: " + result);
    }
}
