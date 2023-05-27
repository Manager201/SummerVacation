import java.util.*;

class unique {
    void main() {
        int n, c = 0, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        while (n != 0) {
            d = n % 10;
            n = n / 10;
            int x = n;
            while (x != 0) {
                if (x % 10 == d)
                    c++;
                x=x/10;
            }

        }
        if (c == 0)
            System.out.println("Yes! Unique Digit Number");
        else
            System.out.println("Not! Unique Digit Number");
    }
}
