import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int agree = 0;
        int disagree = 0;
        for (int i = 0; i < N; i++) {
            int tmp = sc.nextInt();
            if (tmp == 1) agree++;
            else disagree++;
        }
        if (agree >= disagree) {
            System.out.println("Junhee is cute!");
        } else {
            System.out.println("Junhee is not cute!");
        }

    }
}