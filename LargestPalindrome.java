 public class LargestPalindrome {
        public static String findLargestPalindrome(String inputStr) {
            // Remove leading and trailing zeros
            inputStr = inputStr.replaceAll("^0+|0+$", "");
    
            // Check if the remaining string is empty or consists of only one digit
            if (inputStr.isEmpty() || inputStr.length() == 1) {
                return inputStr;
            }
    
            String largestPalindrome = "";
            int length = inputStr.length();
    
            for (int i = 0; i < length; i++) {
                // Check for odd-length palindromes
                int left = i;
                int right = i;
                while (left >= 0 && right < length && inputStr.charAt(left) == inputStr.charAt(right)) {
                    left--;
                    right++;
                }
                String currentPalindrome = inputStr.substring(left + 1, right);
                if (currentPalindrome.length() > largestPalindrome.length()) {
                    largestPalindrome = currentPalindrome;
                }
    
                // Check for even-length palindromes
                left = i;
                right = i + 1;
                while (left >= 0 && right < length && inputStr.charAt(left) == inputStr.charAt(right)) {
                    left--;
                    right++;
                }
                currentPalindrome = inputStr.substring(left + 1, right);
                if (currentPalindrome.length() > largestPalindrome.length()) {
                    largestPalindrome = currentPalindrome;
                }
            }
    
            return largestPalindrome;
        }
    
        public static void main(String[] args) {
            String input1 = "38987";
            String input2 = "00900";
            String input3 = "7";
    
            String output1 = findLargestPalindrome(input1);
            String output2 = findLargestPalindrome(input2);
            String output3 = findLargestPalindrome(input3);
    
            System.out.println("Input 1: " + input1);
            System.out.println("Output 1: " + output1);
    
            System.out.println("Input 2: " + input2);
            System.out.println("Output 2: " + output2);
    
            System.out.println("Input 3: " + input3);
            System.out.println("Output 3: " + output3);
        }
    }
