import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int shortest = 1000;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a <= b) {
                shortest = Math.min(shortest, b);
            }
        }
        System.out.println(shortest);
    }
}