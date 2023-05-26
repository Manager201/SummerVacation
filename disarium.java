import  java.util.*;
class disarium
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,d,c=0,x,s=0;
        System.out.println("Enter a number");
        n=sc.nextInt();
        int m=n,o=n;
        while(n!=0)
        {
            d=n%10;
            c++;
            n=n/10;
        }
        while(m!=0)
        {
            x=m%10;
            s=s+(int)Math.pow(x,c);
            c--;
            m=m/10;
        }
        if(o==s)
            System.out.println("Yes! Disarium Number");
        else
            System.out.println("Not! Disarium Number");

    }
}