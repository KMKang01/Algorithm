import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int N = Integer.parseInt(input.split(" ")[0]); // 정점 개수
        int M = Integer.parseInt(input.split(" ")[1]); // 간선 개수
        int V = Integer.parseInt(input.split(" ")[2]); // 시작 정점

        List<Integer>[] graph = new ArrayList[N + 1]; // 그래프를 인접 리스트로 표현

        // 그래프 초기화
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 정보 입력받아 그래프 구성
        for (int i = 0; i < M; i++) {
            String line = br.readLine();
            int a = Integer.parseInt(line.split(" ")[0]);
            int b = Integer.parseInt(line.split(" ")[1]);
            graph[a].add(b);
            graph[b].add(a);
        }

        // 작은 번호의 정점부터 탐색하기 위해 인접 리스트 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        // DFS 결과 출력 (스택 사용)
        boolean[] visited = new boolean[N + 1]; // 방문 여부를 확인하는 배열
        StringBuilder dfsResult = DFS(V, graph, visited);
        System.out.println(dfsResult.toString().trim());

        // BFS 결과 출력
        Arrays.fill(visited, false); // 방문 배열 초기화
        StringBuilder bfsResult = BFS(V, graph, visited);
        System.out.println(bfsResult.toString().trim());
    }

    // DFS 함수 (스택 사용 방식)
    static StringBuilder DFS(int V, List<Integer>[] graph, boolean[] visited) {
        StringBuilder sb = new StringBuilder();
        Deque<Integer> stack = new ArrayDeque<>(); // DFS에 사용할 스택
        stack.push(V); // 시작 정점을 스택에 추가

        while (!stack.isEmpty()) {
            int now = stack.pop(); // 스택에서 정점을 꺼냄

            if (!visited[now]) { // 방문하지 않은 정점이라면
                visited[now] = true; // 방문 처리
                sb.append(now).append(" "); // 현재 정점 결과 문자열에 추가

                // 인접한 정점을 스택에 추가 (역순으로 추가하여 작은 숫자가 먼저 방문되도록 함)
                List<Integer> neighbors = graph[now];
                for (int i = neighbors.size() - 1; i >= 0; i--) {
                    int next = neighbors.get(i);
                    if (!visited[next]) {
                        stack.push(next);
                    }
                }
            }
        }

        return sb;
    }

    // BFS 함수 (큐 사용 방식)
    static StringBuilder BFS(int V, List<Integer>[] graph, boolean[] visited) {
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>(); // BFS에 사용할 큐
        queue.add(V); // 시작 정점을 큐에 추가
        visited[V] = true; // 시작 정점을 방문처리

        while (!queue.isEmpty()) {
            int now = queue.poll(); // 큐에서 정점을 꺼냄
            sb.append(now).append(" "); // 현재 정점 결과 문자열에 추가

            // 현재 정점과 연결된 다른 정점들을 큐에 추가
            for (int next : graph[now]) {
                if (!visited[next]) {
                    queue.add(next);
                    visited[next] = true; // 방문 처리
                }
            }
        }

        return sb;
    }
}