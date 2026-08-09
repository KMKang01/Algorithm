import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.print(valueOfN(n));
    }

    public static int valueOfN(int n) {
        if(n == 1) return 2;
        if(n == 2) return 4;
        return (valueOfN(n-2) * valueOfN(n-1)) % 100;
    }
}