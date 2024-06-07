import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "";
        for (int i = 0; i < 3; i++) {
            int N = Integer.parseInt(sc.nextLine());
            BigInteger sum = BigInteger.ZERO;
            for (int j = 0; j < N; j++) {
                String tmp = sc.nextLine();
                BigInteger big = new BigInteger(tmp);
                sum = sum.add(big);
            }
            if(sum.compareTo(BigInteger.ZERO) == -1 ){
                answer += "-\n";
            } else if(sum.compareTo(BigInteger.ZERO) == 0 ){
                answer += "0\n";
            } else {
                answer += "+\n";
            }

        }
        System.out.println(answer.trim());
    }
}