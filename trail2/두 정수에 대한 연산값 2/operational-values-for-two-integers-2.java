import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b) {
            a = multiply2(a);
            b = add10(b);
        } else {
            b = multiply2(b);
            a = add10(a);
        }

        System.out.printf("%d %d", a, b);
    }

    public static int add10(int n) {
        return n + 10;
    }

    public static int multiply2(int n) {
        return n * 2;
    }
}