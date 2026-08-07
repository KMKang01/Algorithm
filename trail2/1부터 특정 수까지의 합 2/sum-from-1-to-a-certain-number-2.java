import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.print(sum(N));
    }

    public static int sum(int N) {
        if(N == 1) return 1;
        return sum(N - 1) + N;
    }
}