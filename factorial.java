import java.util.Scanner;
public class factorial {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int i,n,fact=1;
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        sc.close();
        for(i=n;i>0;i--)
        {
           fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);
      
      
    }
}
