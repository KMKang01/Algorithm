import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = minValue(a, b, c);
        System.out.print(min);
    }
    
    public static int minValue(int a, int b, int c) {
        return Math.min(a, Math.min(b,c));
    }
}