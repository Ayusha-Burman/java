import java.util.*;

public class checkPassword {
    public static void main(String[] args) {
        String str = "a987 abC012";
        int result = check(str);
        System.out.println(result);
    }

    public static int check(String str) {
        int digit = 0;
        int upper = 0;
        if (str.length() > 4 || str.length() == 4) {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= '0' && ch <= '9') {
                    digit++;
                }
                if (ch >= 'A' && ch <= 'Z') {
                    upper++;
                }
                if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
                    return 0;
                }
                if (str.charAt(i) == '/' || str.charAt(i) == ' ') {
                    return 0;
                }
            }

        } else {
            return 0;
        }
        return 1;
    }
}
