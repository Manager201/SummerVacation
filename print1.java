class print1
{
    void main()
    {
        int i,j;
        char k='A';
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
               System.out.print(k+"    ");
               k++;
            }
            System.out.println();
        }
    }
}