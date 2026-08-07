import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N =  sc.nextInt();
        System.out.print(fibonacci(N));
    }

    public static int fibonacci(int n) {
        if(n == 1) return 1;
        if(n == 2) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}