import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		// 10 11
		// 1  2 -> 3 = 3 * 1

		// 10 11 20 21 22
		// 1  2  2  3  4 -> 12 = 6 * 2

		// 10 11 20 21 22 30 31 32 33
		// 1  2  2  3  4  3  4  5  6 -> 30 = 10 * 3

		// 10 11 20 21 22 30 31 32 33 40 41 42 43 44
		// 1  2  2  3  4  3  4  5  6  4  5  6  7  8 -> 60 = 15 * 4

		// 3 3 4 5 6
		int result = 0;
		if(N == 1 ) {
			result = 3;
		} else {
			int sum = 3;
			for (int i = 0; i < N - 1; i++) {
				sum += (3+i);
			}
			result = sum * N;
		}
		System.out.println(result);
	}
}