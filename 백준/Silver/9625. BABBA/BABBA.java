import com.sun.tools.jconsole.JConsoleContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String display = "A";
		// A -> B
		// B -> BA
		int K = Integer.parseInt(br.readLine());
		long aCount = 0;
		long bCount = 0;
		if (K == 1) {
			aCount = 0;
			bCount = 1;
		}
		if (K == 2) {
			aCount = 1;
			bCount = 1;
		}
		long sum = 0;
		long pp = 1;
		long p = 1;

		for (int i = 3; i <= K; i++) {
			sum = pp + p;
			bCount = sum;
			aCount = sum - pp;
			pp = p;
			p = sum;
		}


		System.out.printf("%d %d%n", aCount, bCount);
	}
}
