import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        System.out.print(gcd(n,m));
    }

    static int gcd(int n, int m) {
        while(m != 0) {
            int r = n % m ;
            n = m;
            m = r;
        }
        return n;
    }
}