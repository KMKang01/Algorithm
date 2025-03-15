import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			br.readLine();
			String [] input = br.readLine().split(" ");
			int max = -1000001;
			int min = 1000001;

			for (int j = 0; j < input.length; j++) {
				int a = Integer.parseInt(input[j]);
				max = Math.max(max, a);
				min = Math.min(min, a);
			}
			sb.append(min).append(" ").append(max).append("\n");
		}
		System.out.println(sb.toString().trim());

	}
}