import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			if(input.equals("P=NP")) {
				sb.append("skipped").append("\n");
			} else {
				String[] parts = input.split("\\+");
				int a = Integer.parseInt(parts[0]);
				int b = Integer.parseInt(parts[1]);
				sb.append(a + b).append("\n");
			}
		}
		System.out.print(sb.toString().trim());
	}
}


