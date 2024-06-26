import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int shortest = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < b) {
                if (shortest == 0) shortest = b;
                else shortest = shortest > b ? b : shortest;
            }
        }
        if (shortest == 0) shortest = -1;
        System.out.println(shortest);
    }
}