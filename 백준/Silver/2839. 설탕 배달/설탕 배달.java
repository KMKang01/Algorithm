import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        int a = (int) Math.floor((double) N / 5);
        int b;
        int c;
        while (a >= 0) {
            if (N - a * 5 == 0 || (N - a * 5) % 3 == 0) {
                b = N - 5 * a;
                if (b != 0) {
                    c = (int) Math.floor((double) b / 3);
                    count += c;
                }
                count += a;
                break;
            } else {
                a--;
            }
        }
        if (a < 0) count = -1;

        System.out.println(count);


    }
}