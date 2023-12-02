public class Rough2 {
    public static void main(String[] args)
    {
        int N=20;

        int result=sample(N);
        System.out.println("result "+result);
    }

     public static int sample(int N)
     {
        int s = 0;

        int f = 1;

        int i= 1;

       while (i <= N) 
       {
          f = f * i; 

          s = s +(i / f); 
          System.out.println(s);
          i=i+1; 
       }
       return s;
    }

     
}
    

