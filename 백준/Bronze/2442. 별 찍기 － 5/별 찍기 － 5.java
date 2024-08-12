import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N ; i++) {
            for (int j = 0; j < N-i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}