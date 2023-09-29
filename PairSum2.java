import java.util.*;
public class PairSum2 {
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        int n=list.size();
        int bp=-1;//breaking point
        for(int i=0;i<n;i++)
        {
            if(list.get(i+1)<list.get(i))
            {
                bp=i;
               break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while(lp != rp)
        {
            if(list.get(lp)+list.get(rp)==target)
            {
                System.out.println(list.get(lp)+" "+list.get(rp));
                break;
            }
            else if(list.get(lp)+list.get(rp)<target)
            {
             lp=(lp+1)%n;
            }
            else
            {
                rp=(n+rp-1)%n;
            }
        }
        //System.out.println("hello");
    }
    
}
