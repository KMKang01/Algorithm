import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.print(n * m / gcd(n, m));
    }

    static int gcd(int n, int m) {
        while( m != 0) {
            int tmp = n % m;
            n = m;
            m = tmp;
        }
        return n;
    }
}