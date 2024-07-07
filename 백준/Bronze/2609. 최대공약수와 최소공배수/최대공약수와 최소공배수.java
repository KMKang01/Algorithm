import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd;
        int lcm;

        int r = 0;
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        while ( min != 0) {
            r = max % min;
            max = min;
            min = r;
        }
        gcd = max;
        lcm = a * b / gcd;
        System.out.printf("%d\n%d", gcd, lcm);

    }
}
