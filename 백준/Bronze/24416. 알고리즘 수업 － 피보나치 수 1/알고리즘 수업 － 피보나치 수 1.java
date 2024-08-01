import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    static int fibCount = 0;
    static int fibonacciCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        fib(n);
        fibonacci(n);

        System.out.println(fibCount + " " + fibonacciCount);
    }

    static int fib(int n) {
        if (n == 1 || n == 2) {
            fibCount++;
            return 1;
        } else return fib(n - 1) + fib(n - 2);
    }

    static int fibonacci(int n) {
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        fibonacciCount++;
        for (int i = 3; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            fibonacciCount++;
        }
        return arr[n - 1];
    }
}


