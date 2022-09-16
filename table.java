import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int i;
        for (i=1;i<=10;i++)
        {
            int prod = n*i;
            System.out.println(n+" * "+i+" = "+prod);
        }
       sc.close(); 
    }
    
}
