import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			String [] line = br.readLine().split(" ");
			int N = Integer.parseInt(line[0]);
			int K = Integer.parseInt(line[1]);
			String line2 [] = br.readLine().split(" ");
			int candies [] = new int[N];
			for (int j = 0; j < N; j++) {
				candies[j] = Integer.parseInt(line2[j]);
			}
			int children = 0;
			for (int j = 0; j < N; j++) {
				while(candies[j] >= K) {
					candies[j] -= K;
					children++;
				}
			}
			sb.append(children).append("\n");
		}
		System.out.print(sb.toString().trim());
	}
}
