import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i;
        int a=0,b=1,c;
        System.out.print("Enter the number of terms: ");
        n=sc.nextInt();
        System.out.println("\n");
        sc.close();
        System.out.print(a+" "+b);
        for(i=2;i<n;i++)
        {
           c=a+b;
           a=b;
           b=c;
           System.out.print(" "+c);
        }
    }
}
