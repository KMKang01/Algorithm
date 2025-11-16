import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		BigInteger pp = BigInteger.ONE;
		BigInteger p = BigInteger.ONE;
		BigInteger sum = BigInteger.ZERO;
		for (int i = 3; i <= N; i++) {
				sum = pp.add(p);
				pp = p;
				p = sum;
		}
		if(N == 1) {
			sb.append("1");
		} else if(N == 2) {
			sb.append("1");
		} else {
			sb.append(sum);
		}
		System.out.println(sb);
	}
}