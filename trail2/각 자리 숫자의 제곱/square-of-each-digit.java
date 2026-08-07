import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc =new Scanner(System.in);
        int N =sc.nextInt();
        System.out.print(sumOfDigitsPow(N));
    }

    public static int sumOfDigitsPow(int N) {
        if(N == 0) return 0;
        int d = N % 10;
        N /= 10;
        return sumOfDigitsPow(N) + d*d;
    }
}