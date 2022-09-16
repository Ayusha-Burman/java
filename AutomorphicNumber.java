import java.util.Scanner;
public class AutomorphicNumber {
    public static void main(String[] args)
    {
        int num, square;
        int numlast=0;
        int squarelast=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        num=sc.nextInt();
        square=num*num;
        numlast=num%10;
        squarelast=square%10;
        if(numlast==squarelast)
        {
            System.out.println(num+" is a Automorphic Number");
        }
        else
        {
            System.out.println(num+" is not a Automorphic Number");
        }
        sc.close();
    }
}
