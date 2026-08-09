import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(sequence(n));
    }

    public static int sequence(int n) {
        if(n == 1) return 0;
        return n % 2 == 0 ? sequence(n/2) + 1 : sequence(n * 3 + 1) + 1;
    }

}