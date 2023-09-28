import java.util.*;
public class PairSum {
    public static void main(String args[])
    {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 8;
        int i=0;
        int j=list.size()-1;
        while(i<j)
        {
            if(list.get(i)+list.get(j)==target)
            {
                System.out.println(list.get(i)+" "+list.get(j));
                break;
            }
            else if(list.get(i)+list.get(j)<target){
                i++;
            }
            else
            {
                j--;
            }
        }
    }
    
}
