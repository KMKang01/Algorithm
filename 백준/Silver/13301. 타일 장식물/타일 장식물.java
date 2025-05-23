import com.sun.tools.jconsole.JConsoleContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		// N = 1 -> 1 * 4   				f[0]
		// N = 2 -> 1 * 4 + 1 * 2			f[1]
		// N = 3 -> (1 + 1) * 4 + 1 * 2 	f[2]
		// N = 4 -> (2 + 1) * 4 + 2 * 2		f[3]

		BigInteger sum = BigInteger.ZERO;
		BigInteger tmp = BigInteger.ZERO;
		BigInteger pp = BigInteger.ONE;
		BigInteger p = BigInteger.ONE;

		if (N == 1) {
			sum = BigInteger.valueOf(4);
		} else if (N == 2) {
			sum = BigInteger.valueOf(6);
		} else {
			for (int i = 3; i <= N; i++) {
				tmp = pp.add(p);
				sum = (tmp.multiply(BigInteger.valueOf(4))).add(p.multiply(BigInteger.TWO));
				pp = p;
				p = tmp;
			}
		}
		System.out.println(sum);


	}
}
