import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String line = br.readLine();
		while(!line.equals("0 0")){
			String [] parts = line.split(" ");
			int B = Integer.parseInt(parts[0]);
			int N = Integer.parseInt(parts[1]);

			// while currentGap >= nextGap
			int A = 0;
			int currentGap = Math.abs(B - (int) Math.pow(A, N));
			int nextGap = Math.abs(B - (int) Math.pow(A + 1, N));
			while (currentGap >= nextGap) {
				A++;
				currentGap = Math.abs(B - (int) Math.pow(A, N));
				nextGap = Math.abs(B - (int) Math.pow(A + 1, N));
			}
			sb.append(A).append("\n");
			line = br.readLine();
		}

		System.out.println(sb.toString().trim());
	}
}
