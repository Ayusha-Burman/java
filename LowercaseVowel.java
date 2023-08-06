import java.util.*;
public class LowercaseVowel {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String str=sc.nextLine();
        char ch='a';
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(str.charAt(i)>='a'&& str.charAt(i)<='z')
            {
              if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
              {
                count++;
              }
            }
        }
        System.out.println("The number of lowercase vowels in "+str+" is: "+count);
    }
    
}
