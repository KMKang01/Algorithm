import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line = br.readLine().split(" ");
		BigInteger K = new BigInteger(line[0]);
		int L = Integer.parseInt(line[1]);

		boolean isGood = true;
		int cur = 0;
		for (int i = 2; i < L; i++) {
			if(K.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
				isGood = false;
				cur = i;
				break;
			}
		}

		System.out.println(isGood ? "GOOD" : "BAD " + cur);
	}
}
