import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		String line = "* ".repeat(N);
		for (int i = 0; i < N; i++) {
			if ( i % 2 == 1) sb.append(" ").append(line.trim()).append("\n");
			else sb.append(line.trim()).append("\n");
		}

		System.out.println(sb.toString().trim());
	}
}
