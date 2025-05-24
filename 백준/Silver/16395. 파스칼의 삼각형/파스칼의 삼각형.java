import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		int n = Integer.parseInt(line[0]) - 1;
		int k = Integer.parseInt(line[1]) - 1;

		long result = 0;
		long denominator = 1;
		long numerator = 1;

		if (k == 0) {
			result = 1;
		} else {
			if (k > n - k) k = n - k;
			result = 1;
			for (int i = 1; i <= k; i++) {
				result = result * (n - i + 1) / i;
			}
		}

		System.out.println(result);
	}
}

