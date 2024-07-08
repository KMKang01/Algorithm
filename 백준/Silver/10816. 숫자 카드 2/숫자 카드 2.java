import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<>();

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            if(map.containsKey(a)){
                map.put(a, map.get(a)+1);
            } else {
                map.put(a, 1);
            }
        }
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int b = sc.nextInt();
            if(map.containsKey(b)){
                sb.append(map.get(b)).append(" ");
            } else {
                sb.append("0").append(" ");
            }
        }
        System.out.println(sb);
    }
}
