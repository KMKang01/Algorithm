import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String N = br.readLine();
		BigInteger num = new BigInteger(N);

		while(num.compareTo(new BigInteger("0")) != 0) {
			if(num.mod(new BigInteger("2")).equals(BigInteger.ZERO)) {
				sb.append(0);
				num = num.divide(new BigInteger("2"));
			} else {
				sb.append(1);
				num = num.divide(new BigInteger("2"));
			}
		}
		System.out.println(sb.reverse().toString());

	}
}