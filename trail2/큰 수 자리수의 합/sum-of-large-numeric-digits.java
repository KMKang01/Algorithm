import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int multiply = a * b * c;

        System.out.print(sumOfDigits(multiply));
    }

    public static int sumOfDigits(int n) { 
        if( n == 0) return n;
        return n % 10 + sumOfDigits(n/10);
    }
}