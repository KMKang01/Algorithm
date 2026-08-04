import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        print1toN(n);
        System.out.println();
        printNto1(n);
    }

    public static void print1toN(int n) {
        
        if( n == 0) {
            return;
        }
        print1toN(n - 1);
        System.out.print(n + " ");
    }

    public static void printNto1(int n) {
        if( n > 0 ) {
            System.out.print(n + " ");
            n--;
            printNto1(n);
        }
    }
}