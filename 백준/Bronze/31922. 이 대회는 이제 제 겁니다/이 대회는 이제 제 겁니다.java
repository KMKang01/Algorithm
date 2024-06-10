import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int P = sc.nextInt();
        int C = sc.nextInt();

        int total = 0;
        total = A + C >= P ? A + C : P;

        System.out.println(total);
    }
}