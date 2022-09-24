import java.util.Scanner;
public class TestRowSorting {
    public static void main(String[] args)
    { int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the  array");
            n=sc.nextInt();
        RowSorting obj1=new RowSorting(n);
        
        obj1.input();
        obj1.display();
        obj1.sort();
        obj1.display();
    }
}
