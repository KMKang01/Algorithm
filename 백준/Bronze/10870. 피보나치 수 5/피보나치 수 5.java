import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        final int f0 = 0;
        final int f1 = 1;

        int fn = 0;
        int fnPrev = 0;
        int fnPrevPrev = 0;

        for (int i = 0; i <= N ; i++) {
            if( i == 0 ){
                fn = f0;
            } else if (i == 1) {
                fnPrev = f0;
                fn = f1;
            } else if( i==2) {
                fnPrevPrev = f0;
                fnPrev = fn;
                fn = fnPrev + fnPrevPrev;
            } else {
                fnPrevPrev = fnPrev;
                fnPrev = fn;
                fn = fnPrevPrev+fnPrev;
            }
        }

        System.out.println(fn);
    }
}