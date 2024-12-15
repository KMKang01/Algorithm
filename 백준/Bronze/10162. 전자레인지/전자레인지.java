import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static final int A = 300;
	public static final int B = 60;
	public static final int C = 10;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int countA = 0;
		int countB = 0;
		int countC = 0;

		if (T >= A) {
			countA += (int) Math.floor((double) T / A);
			T %= A;
		}
		if (T >= B) {
			countB += (int) Math.floor((double) T / B);
			T %= B;
		}
		if (T >= C) {
			countC += (int) Math.floor((double) T / C);
			T %= C;
		}
		if (T != 0) {
			System.out.println(-1);
		} else {
			System.out.printf("%d %d %d", countA, countB, countC);
		}
	}
}