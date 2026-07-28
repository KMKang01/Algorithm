import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(judgeNum(n));
    }

    public static String judgeNum(int n) {
        int sumOfDigit = n % 10 + ((n/10) % 10);
        if(n % 2 == 0 && sumOfDigit % 5 == 0) return "Yes";
        else return "No";
    }
}