import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int now = sc.nextInt();
            sb.append(now).append(" ").append(now).append("\n");
        }
        System.out.println(sb);
    }
}