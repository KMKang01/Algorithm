import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = (n * ( n + 1 ) / 2) / 10;
        System.out.print(answer);
    }
}