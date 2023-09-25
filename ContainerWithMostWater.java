import java.util.*;
public class ContainerWithMostWater {
    public static void main(String[] args)
    {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1); 
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int result = calculate(height);
        System.out.println(result);

    }
    public static int calculate(ArrayList<Integer> height)
    {
        int currWater=Integer.MIN_VALUE;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp)
        {
            int length=Math.min(height.get(lp), height.get(rp));
            int width=rp-lp;
            int area=length*width;
            if(currWater<area)
            {
                currWater=area;
            }
            if(lp<rp)
            {
                lp++;
            }
            else
            {
                rp--;
            }

        }
        return  currWater;
    }
}
