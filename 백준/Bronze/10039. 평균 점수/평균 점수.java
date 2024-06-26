import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int now = sc.nextInt();
            if (now < 40) now = 40;
            sum += now;
        }
        System.out.println(sum/5);
    }
}