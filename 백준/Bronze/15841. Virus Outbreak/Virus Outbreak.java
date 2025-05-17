import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		BigInteger cow = BigInteger.ONE;
		BigInteger p = BigInteger.ONE;
		BigInteger pp = BigInteger.ONE;
		/*
			10" 55
			9" 34
			8" 21
			7" 13
			6" 8
			5" 5
			4" 3
			3" 2
			2" 1
			1" 1
			0" 0
		*/
		StringBuilder sb = new StringBuilder();
		while (a != -1) {
			sb.append("Hour ").append(a).append(": ");
			if (a == 1 || a == 2) {
				cow = BigInteger.ONE;
			}
			for (int i = 3; i <= a; i++) {
				cow = p.add(pp);
				pp = p;
				p = cow;
			}
			sb.append(cow).append(" cow(s) affected\n");
			pp = BigInteger.ONE;
			p = BigInteger.ONE;
			a = Integer.parseInt(br.readLine());
		}
		System.out.println(sb.toString().trim());
	}
}
