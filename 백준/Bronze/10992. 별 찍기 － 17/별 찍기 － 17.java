import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		if (N != 1) {
			for (int i = 0; i < N - 1; i++) {
				sb.append(" ");
			}
			sb.append("*\n");
		}

		for (int i = 0; i < N - 2; i++) {
			for (int j = i; j < N - 2; j++) {
				sb.append(" ");
			}
			sb.append("*");
			for (int j = 0; j < 2 * (i + 1) - 1; j++) {
				sb.append(" ");
			}
			sb.append("*\n");
		}

		for (int i = 0; i < 2 * N - 1; i++) {
			sb.append("*");
		}

		System.out.println(sb.toString());
	}
}
