class isbn
{
    void main(int n)
    {
        int r,d,s=0,i,c=0,m=n;
        while(n!=0)
        {
            d=n%10;
            c++;
            n=n/10;
        }
        if(c!=10)
            System.out.println("Illegal ISBN");
        else
        {
            for(i=1;i<=10;i++)
            {
                r=m%10;
                s=s+r*i;
                m=m/10;
            }
            if(s%11==0)
                System.out.println("Legal ISBN");
            else 
                System.out.println("Illegal ISBN");
        }
    }
}
