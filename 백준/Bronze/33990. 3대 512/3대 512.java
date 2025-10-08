import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T= Integer.parseInt(br.readLine());

		int max = -1;
		for (int i = 0; i < T; i++) {
			String [] input = br.readLine().split(" ");
			int A = Integer.parseInt(input[0]);
			int B = Integer.parseInt(input[1]);
			int C = Integer.parseInt(input[2]);

			if(A+B+C >= 512) {
				max = max == - 1 ? A+B+C : Math.min(max, A+B+C);
			}
		}

			System.out.println(max);
	}
}
