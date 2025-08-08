import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String line = br.readLine();
		double prev = Double.MAX_EXPONENT;
		double cur = 0.0;
		while (!line.equals("999")) {
			if (prev == Double.MAX_EXPONENT) {
				prev = Double.parseDouble(line);
			} else {
				cur = Double.parseDouble(line);
				System.out.printf("%.2f\n", (cur - prev));
				prev = cur;
			}
			line = br.readLine();
		}


	}
}
