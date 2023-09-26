import java.util.*;
public class TrappingRainWater {
    public static void main(String[] args)
    {
        int[] height={4,2,0,6,3,2,5};
        int result=calculate(height);
        System.out.println(result);
    }
    public static int calculate(int[] height)
    {
        //left
       int[] leftarray=new int[height.length];
       leftarray[0]=height[0];
       for(int i=1;i<height.length;i++)
       {
        if(leftarray[i-1]<height[i])
        {
            leftarray[i]=height[i];
        }
        else
        {
            leftarray[i]=leftarray[i-1];
        }
       }
       //right
       int[] rightarray=new int[height.length];
       rightarray[height.length-1]=height[height.length-1];
       for(int i=height.length-2;i>=0;i--)
       {
        if(rightarray[i+1]<height[i])
        {
            rightarray[i]=height[i];
        }
        else
        {
            rightarray[i]=rightarray[i+1];
        }
       }
       
       //water level 
       int trappedWater=0;
       for(int i=0;i<height.length;i++)
       {
        int waterLevel=Math.min(leftarray[i], rightarray[i]);
        trappedWater=trappedWater+(waterLevel-height[i]);
       }
       return trappedWater;
    }
}
