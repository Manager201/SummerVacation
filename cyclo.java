import java.util.*;
class cyclo
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int n;  
        System.out.println("Enter a number");
        n=sc.nextInt();
        int m=n, s=m%10,d,r=0;
        while(n!=0)
        {
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        int t=r%10;
        if(s==t)
        System.out.println("Cyclo Number");
        else
        System.out.println("It is not a cyclo number");
    }
}
