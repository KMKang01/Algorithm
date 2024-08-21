import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String condition = br.readLine();
        int N = Integer.parseInt(condition.split(" ")[0]);
        int M = Integer.parseInt(condition.split(" ")[1]);
        int V = Integer.parseInt(condition.split(" ")[2]);

        List<Integer>[] graph = new List[N + 1];

        for (int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        } // 그래프 초기화

        for (int i = 0; i < M; i++) {
            String edge = br.readLine();
            int a = Integer.parseInt(edge.split(" ")[0]);
            int b = Integer.parseInt(edge.split(" ")[1]);
            graph[a].add(b);
            graph[b].add(a); // 양방향 그래프이므로 연결관계를 양쪽에 추가해줘야 함.
        } // 간선 추가(연결관계 생성)

        System.out.println(DFS(V, graph));
        System.out.println(BFS(V, graph));
    }

    static void printGraph(List<Integer>[] graph) {
        for (List<Integer> node : graph){
            for (int v : node ){
                System.out.print(" "+ v + " -> ");
            }
            System.out.println();
        }
    }

    static String DFS(int V, List<Integer>[] graph){
        StringBuilder sb = new StringBuilder();
        boolean [] visited = new boolean[graph.length];
        // 방문을 확인할 배열. 초기화하지 않은 경우 모든 원소는 false이다.
        List<Integer>[] dfsGraph = graph;
        for( List<Integer> node: dfsGraph){
            node.sort(Comparator.reverseOrder());
        } // 스택에 넣을 때 작은 숫자가 위에 오게 하기 위해 역순으로 정렬
//        printGraph(dfsGraph);

        Deque<Integer> stack = new ArrayDeque<>(); // 방문 정점의 스택

        stack.push(V);
        visited[V] = true;
        while(!stack.isEmpty()){
            int now = stack.pop(); // 정점 방문
            sb.append(now + " ");
            for(int a : dfsGraph[now] ){
                // 현재 방문한 정점의 인접 정점들의 방문 여부를 검사하고 스택에 넣을지 말지 판단.
                if(!visited[a]){ // 아직 방문 확인 배열에 없는 정점인 경우
                    stack.push(a); // 스택에 넣고
                    visited[a] = true; // 방문 확인 배열을 참으로 바꿈
                } else { // 방문한 배열로 체크되어 있는 경우
                    if ( stack.contains(a)){ // 스택에 포함되어 있으면
                        stack.remove(a);
                        stack.push(a); // 순서를 끌어올려줌
                    }
                }
            }
        }

        return sb.toString().trim();
    }

    static String BFS(int V, List<Integer>[] graph){
        StringBuilder sb = new StringBuilder();
        boolean[] visited = new boolean[graph.length];
        List<Integer>[] bfsGraph = graph;
        for( List<Integer> node: bfsGraph){
            Collections.sort(node);
        }

        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(V);
        visited[V] = true;
        while(!queue.isEmpty()){
            int now = queue.pop();
            sb.append(now + " ");
            for(int a : bfsGraph[now] ){
                if(!visited[a]){
                    queue.add(a);
                    visited[a] = true;
                }
            }
        }

        return sb.toString().trim();
    }
}