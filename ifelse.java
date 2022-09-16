import java.util.Scanner;
public class ifelse 
{
    public static void main(String[] args)
     {
         int n=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        if(n%2==0)
        {
            if(n>=2 && n<=5)
            {
                System.out.println("Not weird");
            }
            else if (n>=6 && n<=20)
            {
                System.out.println("Weird");
            }
            else
            {
                System.out.println("Not Weird");
            }
        }
        else
        {
            System.out.println("Weird"); 
        }
        sc.close();
    }
}
