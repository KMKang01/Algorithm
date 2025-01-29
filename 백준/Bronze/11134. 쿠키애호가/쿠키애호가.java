import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String [] line = br.readLine().split(" ");

			int n = Integer.parseInt(line[0]);
			int m = Integer.parseInt(line[1]);

			sb.append((int)(Math.ceil((double) n/m))).append("\n");
		}
		System.out.println(sb.toString().trim());
	}
}