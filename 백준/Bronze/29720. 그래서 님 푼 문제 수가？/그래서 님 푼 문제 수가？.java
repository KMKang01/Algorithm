import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		int K = Integer.parseInt(input[2]);

		// N <= 현재 문제 수 + M * K < N + M
		int curMin = Math.max(0, N - M * K) ;
		int curMax = Math.max(0, N + M - M * K - 1);

		System.out.println(curMin + " " + curMax)	;
	}
}