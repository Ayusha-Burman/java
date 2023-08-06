import java.util.*;
public class Anagrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first word: ");
        String str1=sc.nextLine();
        System.out.println("Enter the second word: ");
        String str2=sc.nextLine();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()==str2.length())
        {
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if(result)
            {
              System.out.println("anagrams");
            }
            else
            {
                System.out.println("not anagrams");

            }
        }
        
    }
}
