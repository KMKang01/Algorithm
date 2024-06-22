import java.math.BigInteger;

public class Test {
    long sum(int[] a) {
        long ans = 0;
        BigInteger big = new BigInteger("0");
        for(int i = 0; i < a.length; i++){
            big = big.add(BigInteger.valueOf(a[i]));
        }
        ans = big.longValue();
        return ans;
    }
}
