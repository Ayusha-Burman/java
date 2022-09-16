import java.util.Scanner;
public class DuckNumber 
{
    public static void main(String[] args)
    {
        
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a number: ");
      String str=sc.nextLine();
      int len=str.length();
      char ch;
      char check=str.charAt(0);
      int ctr=0;
      if(check=='0')
      {
        System.out.println("Not a Duck Number");
      }
      else
      {
        for(int i=0;i<len;i++)
        {
            ch = str.charAt(i); 
            if(ch=='0')
                ctr++;
        }
        if(ctr>0)
        {
            System.out.println("Duck number");
        }
        else{
            System.out.println("Not a duck number");
        }
  
      }
      sc.close();
    }
}
