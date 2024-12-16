import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

/*
    P = 소수 p, q의 곱.
    if ( p < k && q < k ) GOOD 출력
    else {
        BAD p와 q중 작은 소수 출력
    }
    ----------------------------
    소수 구하는 방법
    - 합성수는 항상 약수의 곱이 대칭이다.
    ex) 1 * 16, 2*8, 4*4. 8*2, 16*1
    즉, 해당 수가 합성수라면 제곱근까지 for 문을 돌리면서
    1을 제외한 수로 나눠지는지 확인하였을 때 나눠질 것.
    나눠지지 않는 경우 => 소수임을 알 수 있다.
*/


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] line = br.readLine().split(" ");

        BigInteger P = new BigInteger(line[0]);
        int K = Integer.parseInt(line[1]);

        boolean isGood = true;
        int r = 0;

        for (int i = 2; i < K ; i++) {
            if(P.remainder(BigInteger.valueOf(i)).equals(BigInteger.ZERO)){
                isGood = false;
                r = i;
                break;
            }
        }

        if(isGood)
            System.out.println("GOOD");
        else
            System.out.printf("BAD %d", r);
    }
}