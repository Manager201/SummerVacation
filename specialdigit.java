import java.util.*;

class specialdigit {
    void main() {
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
                System.out.println("Special 2-digit number");
            else
                System.out.println("It is not a Special 2-digit number");
    }
}
