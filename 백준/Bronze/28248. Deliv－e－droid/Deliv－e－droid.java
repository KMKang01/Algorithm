import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int C = sc.nextInt();
        int answer = 0;
        if(P > C) {
            answer = P*50 -C*10 +500;
        } else {
            answer = P*50 - C*10;
        }
        System.out.println(answer);

    }
}