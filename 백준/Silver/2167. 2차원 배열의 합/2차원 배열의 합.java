import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] ln1 = br.readLine().split(" ");
		int N = Integer.parseInt(ln1[0]);
		int M = Integer.parseInt(ln1[1]);

		int[][] matrix = new int[N][M];
		for (int i = 0; i < N; i++) {
			String[] row = br.readLine().split(" ");
			for (int j = 0; j < M; j++) {
				matrix[i][j] = Integer.parseInt(row[j]);
			}
		}

		int K = Integer.parseInt(br.readLine());

		for (int t = 0; t < K; t++) {
			String[] range = br.readLine().split(" ");
			int i = Integer.parseInt(range[0]);
			int j = Integer.parseInt(range[1]);
			int x = Integer.parseInt(range[2]);
			int y = Integer.parseInt(range[3]);

			int sum = 0;

			for (int p = i - 1; p <= x - 1; p++) {
				for (int q = j - 1; q <= y - 1; q++) {
					sum += matrix[p][q];
				}
			}

			sb.append(sum).append("\n");
		}

		System.out.println(sb.toString().trim());
	}
}