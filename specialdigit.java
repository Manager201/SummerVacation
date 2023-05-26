import java.util.*;
class specialdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int s = 0, p = 1, d, m = n;
        while (n != 0) 
        {
            d = n % 10;
            s = s + d;
            p = p * d;
            n = n / 10;
        }
        if (s + p == m)

            System.out.println("Yes! Sum of digit Number");

        else
            System.out.println("Not! Special 2-digit Number");
    }
}

