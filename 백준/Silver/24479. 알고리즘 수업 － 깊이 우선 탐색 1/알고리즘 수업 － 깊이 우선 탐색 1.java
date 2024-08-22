import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[] visited;
    static int[] list;
    static int count = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        int N = Integer.parseInt(input.split(" ")[0]);
        int M = Integer.parseInt(input.split(" ")[1]);
        int R = Integer.parseInt(input.split(" ")[2]);

        List<Integer>[] graph = new List[N + 1];
        for (int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        visited = new boolean[N + 1];
        list = new int[N + 1];

        for (int i = 0; i < M; i++) {
            String line = br.readLine();
            int a = Integer.parseInt(line.split(" ")[0]);
            int b = Integer.parseInt(line.split(" ")[1]);

            graph[a].add(b);
            graph[b].add(a); // 무방향 == 양방향 그래프
        }

        for (List<Integer> node : graph) {
            if (node != null) {
                node.sort(Comparator.naturalOrder());
            }
        }

        DFS(graph, R);

        for (int i =1; i < list.length;i++) {
            sb.append(list[i]).append("\n");
        }

        System.out.println(sb.toString().trim());
    }

    static void DFS(List<Integer>[] graph, int r) {
        visited[r] = true;
        list[r] = count++;
        for (int v : graph[r]) {
            if (!visited[v])
                DFS(graph, v);
        }
    }
}