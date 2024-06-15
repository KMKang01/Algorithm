import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int[] arr = new int[8];
            int ability = 0;
            for (int i = 0; i < 8; i++) {
                int tmp = sc.nextInt();
                arr[i] = tmp;
            }
            int HP = arr[0] + arr[4];
            int MP = arr[1] + arr[5];
            int atk = arr[2] + arr[6];
            int def = arr[3] + arr[7];
            if (HP < 1) HP = 1;
            if (MP < 1) MP = 1;
            if (atk < 0) atk = 0;
            ability = HP + 5 * MP + 2 * atk + 2 * def;
            sb.append(ability).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}