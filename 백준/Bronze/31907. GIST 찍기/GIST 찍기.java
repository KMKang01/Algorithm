import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			sb.append("G".repeat(T));
			sb.append("...".repeat(T));
			sb.append("\n");
		}

		for (int i = 0; i < T; i++) {
			sb.append(".".repeat(T));
			sb.append("I".repeat(T));
			sb.append(".".repeat(T));
			sb.append("T".repeat(T));
			sb.append("\n");
		}

		for (int i = 0; i < T; i++) {
			sb.append("..".repeat(T));
			sb.append("S".repeat(T));
			sb.append(".".repeat(T));
			sb.append("\n");
		}

		System.out.println(sb.toString().trim());
	}
}
