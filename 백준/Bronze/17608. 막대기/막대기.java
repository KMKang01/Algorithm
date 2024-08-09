import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();
        int count = 0;
        for (int i = 0; i < N ; i++) {
            stack.push(Integer.parseInt(br.readLine()));
        }
        int right = stack.pop();
        count++;
        for( int a : stack){
            if ( a > right) {
                count++;
                right = a;
            }
        }
        System.out.println(count);
    }
}