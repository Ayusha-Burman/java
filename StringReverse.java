import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str;
        String nstr="";
        System.out.print("Enter the String to be reversed: ");
        str=sc.nextLine();
        System.out.println("Original word: "+str);
        char ch;
        for(int i=0;i<str.length();i++)
       {
         ch=str.charAt(i);
         nstr=ch+nstr;
       }
       System.out.println("Reversed word: "+nstr);
    }
}
