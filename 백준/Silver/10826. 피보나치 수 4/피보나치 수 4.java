import com.sun.tools.jconsole.JConsoleContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());

		BigInteger sum = BigInteger.ZERO;

		if (a == 0) {
			sum = BigInteger.ZERO;
		} else if (a == 1) {
			sum = BigInteger.ONE;
		} else {
			BigInteger pp = BigInteger.ZERO;
			BigInteger p = BigInteger.ONE;
			for (int i = 2; i <= a; i++) {
				sum = pp.add(p);
				pp = p;
				p = sum;
			}
		}
		System.out.println(sum);
	}
}
