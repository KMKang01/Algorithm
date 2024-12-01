import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String[] line = br.readLine().split(" ");
			int c = Integer.parseInt(line[0]);
			int v = Integer.parseInt(line[1]);
			sb.append("You get ")
					.append((int)Math.floor(c / v))
					.append(" piece(s) and your dad gets ")
					.append(c % v)
					.append(" piece(s).\n");
		}

		System.out.println(sb.toString().trim());

	}
}