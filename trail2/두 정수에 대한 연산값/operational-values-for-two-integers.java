import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b) {
            a = add25(a);
            b = multiple2(b);
        } else {
            b = add25(b);
            a = multiple2(a);
        }
        
        System.out.printf("%d %d", a, b);
    }

    public static int add25(int n) {
        return n + 25;
    }

    public static int multiple2(int n) {
        return n * 2;
    }
}