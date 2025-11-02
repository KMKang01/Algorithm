import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			long sum = 0;
			for (int j = 1; j <= N; j++) {
				sum += j * ((long) (j+1) * (j + 2)) / 2;
			}
			sb.append(sum).append('\n');
		}
		System.out.println(sb.toString().trim());
	}
}