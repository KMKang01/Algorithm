import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(awkwardArray( n));
    }

    public static int awkwardArray(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        return awkwardArray(n/3) + awkwardArray(n-1);
    }
}