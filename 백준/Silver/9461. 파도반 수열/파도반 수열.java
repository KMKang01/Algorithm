import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(getPN(N)).append("\n");
        }

        System.out.print(sb.toString().trim());

    }

    public static long getPN(int N) {
        if(N <= 3) return 1;
        long [] arr = new long[N];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        for (int i = 3; i < N ; i++) {
            arr[i] = arr[i - 2] + arr[i - 3];
        }

        return arr[N-1];
    }

}