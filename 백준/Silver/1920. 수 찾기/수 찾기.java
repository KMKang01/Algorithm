import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        Map<Integer, Integer> map = new LinkedHashMap<>();

        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            map.put(num, 0);
        }

        int M = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < M; i++) {
            int num = sc.nextInt();
            sb.append(map.containsKey(num) ? "1\n" : "0\n");
        }
        System.out.println(sb.toString().trim());
    }
}