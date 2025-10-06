import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T= Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			String [] input = br.readLine().split(" ");
			long A = Integer.parseInt(input[0]);
			long B = Integer.parseInt(input[1]);

			sb.append((A/B)*(A/B)).append("\n");
		}
		System.out.println(sb.toString().trim());
	}
}
