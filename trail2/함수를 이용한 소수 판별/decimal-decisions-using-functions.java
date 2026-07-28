import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(sumOfPrimes(a, b));
    }

    public static int sumOfPrimes(int a, int b){
        int sum = 0;
        for(int i = a; i<= b; i++) {
            if(judgePrime(i)) sum += i;
        }
        return sum;
    }

    public static boolean judgePrime(int n) {
        boolean flag = true;
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}