import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);

		String[] nums = br.readLine().split(" ");

		int count = 0;
		/*
			최대: n * (n+1) / 2
			1(X), 1 2(X) 1 2 3 > 5 (X) -> 1 스킵
			2(X), 2 3 == 5(O) 2 스킵
			3(X), 3 4 > 5 (X) -> 3 스킵
			4(X), 4 2 > 5 (X) -> 4 스킵
		*/
		for (int i = 0; i < N; i++) {
			int sum = 0;
			for (int j = i; j < N; j++) {
				if ( sum + Integer.parseInt(nums[j]) == M) {
					count++;
					break;
				} else if (sum + Integer.parseInt(nums[j]) > M) {
					break;
				} else {
					sum += Integer.parseInt(nums[j]);
				}
			}
		}
		System.out.println(count);

	}
}