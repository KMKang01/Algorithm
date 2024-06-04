import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String answer = "";
        while (N >= 1) {
            String tmp = "";
            for (int i = 1; i <= N; i++)
                tmp += "*";
            answer += tmp + "\n";
            N--;
        }
        System.out.println(answer.trim());
    }
}