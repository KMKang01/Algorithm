import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n; i++) {
            for(int j = 0 ; j < m; j++) {
                sb.append("1");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}