import java.util.Scanner;
public class FloydTriangle 
{
    public static void main(String[] args)
     {
        int n=5;
        int k=1;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
