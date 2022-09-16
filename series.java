import java.util.Scanner;


public class series{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int sum =0;
        int q=in.nextInt();
        for(int i=0;i<q;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<=n;j++)
            {
               sum = sum + a + (b*(2^j));
               System.out.print(sum+" ");
            }
        }
        in.close();
    }
}