import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 컴퓨터 수
        int m = Integer.parseInt(br.readLine()); // 연결되어 있는 쌍

        List<Integer>[] graph = new List[n + 1];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            String edge = br.readLine();
            int a = Integer.parseInt(edge.split(" ")[0]);
            int b = Integer.parseInt(edge.split(" ")[1]);
            graph[a].add(b);
            graph[b].add(a);
        }
        System.out.println(DFS(graph));

    }

    static int DFS(List<Integer>[] graph) {
        boolean[] visited = new boolean[graph.length];
        int count = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        visited[1] = true;
        while (!stack.isEmpty()) {
            int now = stack.pop();
            count++;
            for (int v : graph[now]) {
                if (!visited[v]) {
                    stack.push(v);
                    visited[v] = true;
                }
            }
        }

        return --count;
    }
}