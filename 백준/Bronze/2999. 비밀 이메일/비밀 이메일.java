import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line = br.readLine().split("");
		int N = line.length;
		int R = 1, C = N;
		for (int i = 1; i * i <= N; i++) {
			if (N % i == 0) {
				R = i;
				C = N / i;
			}
		}

		String [][] matrix = new String[C][R];

		for (int i = 0; i < C; i++) {
			for (int j = 0; j < R; j++) {
				matrix[i][j] = line[i*R + j];
			}
		}

		for (int j = 0; j < R; j++) {
			for (int i = 0; i < C; i++) {
				sb.append(matrix[i][j]);
			}
		}

		System.out.println(sb);
	}
}