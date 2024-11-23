import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		while (!input.equals("0")) {
			int length = 0;
			String[] lines = input.split("");
			for (int i = 0; i < lines.length; i++) {
				int now = Integer.parseInt(lines[i]);

				if (now == 1) length += 2;
				else if (now == 0) length += 4;
				else length += 3;
			}
			length += lines.length + 1;
			sb.append(length).append("\n");
			input = br.readLine();
		}
		System.out.print(sb.toString().trim());

	}
}