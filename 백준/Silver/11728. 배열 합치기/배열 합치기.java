import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        int N = Integer.parseInt(input.split(" ")[0]);
        int M = Integer.parseInt(input.split(" ")[1]);

        String[] line1 = br.readLine().split(" ");
        String[] line2 = br.readLine().split(" ");

        int[] list1 = new int[N];
        int[] list2 = new int[M];

        for (int i = 0; i < N; i++) {
            list1[i] = Integer.parseInt(line1[i]);
        }
        for (int i = 0; i < M; i++) {
            list2[i] = Integer.parseInt(line2[i]);
        }

        int[] list = new int[N + M];
        for (int i = 0; i < N; i++) {
            list[i] = list1[i];
        }
        for (int i = N; i < N + M; i++) {
            list[i] = list2[i - N];
        }

        Arrays.sort(list);

        for(int a : list){
            sb.append(a).append(" ");
        }
        System.out.println(sb);
    }
}