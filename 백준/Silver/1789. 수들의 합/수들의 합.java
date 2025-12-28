import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		long S = Long.parseLong(br.readLine());

		// 서로 다른 N개의 자연수의 합이 S일떄 N의 최댓값
		int N = (int) ((Math.sqrt(8L * S + 1) - 1) / 2);
		System.out.println(N);


	}
}