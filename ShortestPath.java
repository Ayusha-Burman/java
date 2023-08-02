import java.util.*;
public class ShortestPath {
    public static void main(String[] args)
    {
        String path = "WNEENESENNN";
        int x=0,y=0;
        for(int i=0;i<path.length();i++)
        {
            char ch=path.charAt(i);
            //North
            if(ch=='N')
            {
                y++;
            }
            //South
            else if(ch=='S')
            {
                y--;
            }
            //East
            else if(ch=='E')
            {
                x++;
            }
            //West
            else
            {
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        float sp=0;
        sp=(float)Math.sqrt(x2+y2);
        System.out.println("Shortest Path="+sp);
    }
}
