import java.util.*;
public class StringPlaindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        int n=str.length();
        int flag=0;
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i) != str.charAt(n-1-i))
            {
                System.out.println("Not a palindrome");
                break;
            }
            else{
                flag=1;
            }
        }
        if(flag==1)
        {
            System.out.println("palindrome");
        }

    }
    

    
}
