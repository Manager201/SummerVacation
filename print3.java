class print3
{
    void main()
    {
        int i,j,k;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(k=5;k>=i;k--)
            {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
