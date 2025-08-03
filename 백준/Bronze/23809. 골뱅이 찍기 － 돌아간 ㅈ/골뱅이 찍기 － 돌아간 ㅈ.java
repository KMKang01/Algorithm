import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append("@");
			}
			for (int j = 0; j < 3 * N; j++) {
				sb.append(" ");
			}
			for (int j = 0; j < N; j++) {
				sb.append("@");
			}
			sb.append("\n");
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append("@");
			}
			for (int j = 0; j < 2*N; j++) {
				sb.append(" ");
			}
			for (int j = 0; j < N; j++) {
				sb.append("@");
			}
			sb.append("\n");
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {

				sb.append("@@@");
			}
			sb.append("\n");


		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append("@");
			}
			for (int j = 0; j < 2* N; j++) {
				sb.append(" ");
			}
			for (int j = 0; j < N; j++) {
				sb.append("@");
			}
			sb.append("\n");
		}


		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append("@");
			}
			for (int j = 0; j < 3 * N; j++) {
				sb.append(" ");
			}
			for (int j = 0; j < N; j++) {
				sb.append("@");
			}
			sb.append("\n");
		}

		System.out.println(sb.toString().trim());
	}
}