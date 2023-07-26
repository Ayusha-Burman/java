import java.util.*;
public class SpiralMatrix {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows in the Matrix:");
        int n=sc.nextInt();
        System.out.println("Enter the no. of columns in the Matrix");
        int m=sc.nextInt();
        int[][] matrix=new int[10][10];
        System.out.println("Enter "+(n*m)+" elements for the Matrix");
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
    }
    spiralOrder(n,m,matrix);
}


    public static void spiralOrder(int n, int m, int[][] matrix) {
        int startrow=0;
        int endrow=n-1;
        int startcol=0;
        int endcol=m-1;
        while(startrow<=endrow && startcol <= endcol){
            //top
            for(int j=startcol;j<=endcol;j++)
            {
                System.out.print(matrix[startrow][j]+" ");
            }
            //right
            for(int i=startrow+1;i<=endrow;i++)
            {
                System.out.print(matrix[i][endcol]+" ");
            }
            //bottom
            for(int j=endcol-1;j>=startcol;j--)
            {
                if(startrow==endrow)
                {
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }
            //left
            for(int i=endrow-1;i>=startrow+1;i--)
            {
                if(startcol==endcol)
                {
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        
    }
}
    }



