import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNums(n);
    }

    public static void printNums(int n) {
        if(n == 0) return;
        System.out.print(n+ " ");
        printNums(n - 1);
        System.out.print(n+ " ");
    }
}