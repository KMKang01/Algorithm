import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < 2 * N - 1; i++) {
            if (i <= N - 1) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * N - (2 * i + 1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 2 * (N -1) - i; j > 0; j--) {
                    System.out.print(" ");
                }

                for (int j = (2 * i + 1) - (2 * (N - 1)); j > 0; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}