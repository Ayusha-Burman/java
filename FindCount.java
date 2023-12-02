import java.util.*;
public class FindCount {
    public static void main(String args[])
    {
        int[] arr={8, 8, 8, 8, 8};
        int num=8;
        int diff=1;
        int counter=0;
        for(int i=0;i<arr.length;i++)
        {
            if(num-arr[i]<=2 && num-arr[i]>=-2)
            {
                counter++;
            }
        }
        if(counter==0)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(counter);
        }
    }
    
}
