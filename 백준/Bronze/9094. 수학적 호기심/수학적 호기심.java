import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String [] input = br.readLine().split(" ");
			int n = Integer.parseInt(input[0]);
			int m = Integer.parseInt(input[1]);
			int count = 0;
			for (int a = 1; a < n - 1; a++) {
				for (int b = a+1; b < n; b++) {
					if( ( (a*a + b*b + m) % (a*b) ) == 0 ) {
						count++;
					}
				}
			}
		sb.append(count).append("\n");
		}
		System.out.print(sb.toString().trim());

	}
}
