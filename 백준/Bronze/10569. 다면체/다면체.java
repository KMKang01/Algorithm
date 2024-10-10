import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n ; i++) {
			String [] line = br.readLine().split(" ");
			int v = Integer.parseInt(line[0]);
			int e = Integer.parseInt(line[1]);
			int s = 2 - v + e;
			sb.append(s).append("\n");
		}
		System.out.println(sb.toString().trim());
	}
}
