import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // -1000 <= x <= 1000
        int [] coordinates = new int[2001];
        int prev = 1000; // 좌표상 0
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            // Please write your code here.
            if(dir == 'R') { // 양의 방향으로 이동
                for(int j = prev; j < prev + x; j++) {
                    coordinates[j]++;
                }
                prev += x;
            } else {
                for (int j = prev - x; j < prev; j++) {
                    coordinates[j]++;
                }
                prev -= x;
            }
        }
        
        int sum = 0;
        for(int i : coordinates) if(i >= 2) sum++;
        
        System.out.print(sum);
    }
}

