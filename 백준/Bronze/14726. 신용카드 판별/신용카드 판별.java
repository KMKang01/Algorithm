import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String [] line = br.readLine().split("");
			int sum = 0;
			for (int j = line.length - 1; j >= 0 ; j--) {
				int digit = Integer.parseInt(line[j]);
				if ((line.length - j) % 2 == 0) {
					digit *= 2;
					if (digit > 9) {
						digit -= 9;
					}
				}
				sum += digit;
			}
			sb.append(sum%10 == 0 ? "T" : "F").append("\n");
		}
		System.out.println(sb.toString().trim());
	}
}


