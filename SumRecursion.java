import java.util.Scanner;
public class SumRecursion {
    public static void main(String[] args)
    {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number of natural numbers:");
      int n=sc.nextInt();
      int sum=0;
      int i=0;
      int res = sumRec(i,n,sum);
      System.out.println(res);
    }

    public static int sumRec(int i,int n,int sum)
    {
        if(n==0)
        {
         return 0;
        }
        if(i>n)
        {
            return sum;
        }
       sum = i + sumRec(i+1,n,sum);
       return sum;
    }
    
}
