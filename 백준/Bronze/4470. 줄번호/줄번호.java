import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String answer = "";
        for (int i = 1; i <= N; i++) {
            String tmp = sc.nextLine();
            answer = answer + Integer.toString(i) + ". " + tmp + "\n";
        }
        System.out.println(answer.trim());
    }
}