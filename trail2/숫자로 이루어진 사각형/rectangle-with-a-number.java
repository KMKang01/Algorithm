import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n ; j++) {
                sb.append(num++).append(" ");
                if(num == 10) num = 1;
            }
            sb.append("\n");
        }
        System.out.print(sb.toString().trim());
    }
}