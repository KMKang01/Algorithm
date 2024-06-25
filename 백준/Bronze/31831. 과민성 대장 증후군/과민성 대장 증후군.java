import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt(); // 기준
        int stress = 0;
        int count = 0;
        for(int i = 0; i < N; i++) {
            int todayS = sc.nextInt();
            if(todayS+stress <=0 ){
                stress = 0;
            } else {
                stress = todayS+stress;
            }
            if(stress >= M) count++;
        }
        System.out.println(count);
    }
}