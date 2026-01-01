import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			int sum = 0;
			for (int j = 0; j < N; j++) {
				String [] line = br.readLine().split(" ");
				int max = 0;
				for(String s: line) {
					max = Math.max(max, Integer.parseInt(s));
				}
				sum += max;
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb.toString().trim());
	}
}