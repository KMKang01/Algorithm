import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(sum(n));
    }

    public static int sum(int n) {
        if(n % 2 == 1){
            if(n == 1) return 1;
            return sum(n - 2) + n;
        } else {
            if(n == 2) return 2;
            return sum(n - 2) + n;
        }
    }
}