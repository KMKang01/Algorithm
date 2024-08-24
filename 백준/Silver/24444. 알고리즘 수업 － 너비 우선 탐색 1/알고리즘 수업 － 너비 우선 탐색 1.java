import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[] visited;
    static int [] result;
    static int count = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int N = Integer.parseInt(input.split(" ")[0]);
        int M = Integer.parseInt(input.split(" ")[1]);
        int R = Integer.parseInt(input.split(" ")[2]);

        List<Integer>[] graph = new List[N + 1];
        visited = new boolean[N + 1];
        result = new int[N + 1];

        for(int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M ; i++) {
            String line = br.readLine();
            int a = Integer.parseInt(line.split(" ")[0]);
            int b = Integer.parseInt(line.split(" ")[1]);
            graph[a].add(b);
            graph[b].add(a);
        }

        for(List<Integer> node : graph){
            node.sort(Comparator.naturalOrder());
        }

        System.out.println(dfs(graph, R));
    }
    static String dfs(List<Integer>[] graph ,int i) {
        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new ArrayDeque<>();
        visited[i] = true;
        queue.add(i);
        result[i] = count;
        while(!queue.isEmpty()) {
            int u = queue.pop();
            result[u] = count++;
            for(int v : graph[u]) {
                if(!visited[v]) {
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }

        for (int j = 1; j < result.length ; j++) {
            sb.append(result[j]).append("\n");
        }

        return sb.toString().trim();
    }
}