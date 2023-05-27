import java.util.*;
class primepalindrome
{
    void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int i,a=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            a=a+i;
        }
        int r=0,d,m=n;
        while(n!=0)
        {
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        if(m==r&&a==m+1)
        System.out.println("Prime-Palindrome");
        else
        System.out.println("It is not prime-palindrome");
    }
}
