class emirp
{
    void main(int n)
    {
        int i,a=0,m=n;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
                a=a+i;
        }
        int d,r=0;
        while(n!=0)
        {
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        int j,b=0;
        for(j=1;j<=r;j++)
        {
            if(r%j==0)
                b=b+j;
        }
        if(a==m+1&&b==r+1)
            System.out.println("Emirp Number");
        else
            System.out.println("Not an Emirp Number");
    }
}