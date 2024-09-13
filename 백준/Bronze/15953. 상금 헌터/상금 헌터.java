import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String[] rank = br.readLine().split(" ");

			int a = Integer.parseInt(rank[0]);
			int b = Integer.parseInt(rank[1]);
			int total = 0;

			if (a > 21) a = 0;
			if (b > 31) b = 0;

			if (a == 1) {
				total += 5_000_000;
			} else if (a > 1 && a <= 3) {
				total += 3_000_000;
			} else if (a > 3 && a <= 6) {
				total += 2_000_000;
			} else if (a > 6 && a <= 10) {
				total += 500_000;
			} else if (a > 10 && a <= 15) {
				total += 300_000;
			} else if (a > 15 && a <= 21) {
				total += 100_000;
			}

			if (b == 1) {
				total += 5_120_000;
			} else if (b > 1 && b <= 3) {
				total += 2_560_000;
			} else if (b > 3 && b <= 7) {
				total += 1_280_000;
			} else if (b > 7 && b <= 15) {
				total += 640_000;
			} else if( b > 15 && b <= 31){
				total += 320_000;
			}
			sb.append(total).append("\n");
		}
		System.out.print(sb.toString().trim());
	}
}