public class rough {
    public static void main(String[] args)
    {
        int p,q,r,s;
      p=1;
     q=1;
    for(r=0;r<=2;r++)
    {
        for(s=-4;s<=-2;s++)
        {
            p = p + 2;

            if(p > r)
            {
                continue;
            }
            p=1;
            if(p>s)
            {
                break;
            }
        }
    }
    System.out.println(p+q);

    }
    
}
