import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int L = sc.nextInt();
        int P = sc.nextInt();
        sc.nextLine();
        int total = L*P;
        for(int i = 0; i < 5; i++) {
            int tmp = sc.nextInt();
            sb.append(tmp-total+" ");
        }


        System.out.println(sb.toString().trim());
    }
}