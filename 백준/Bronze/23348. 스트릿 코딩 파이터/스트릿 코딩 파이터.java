import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] line = br.readLine().split(" ");
		int A = Integer.parseInt(line[0]);
		int B = Integer.parseInt(line[1]);
		int C = Integer.parseInt(line[2]);

		int N = Integer.parseInt(br.readLine());

		int max = 0;

		for (int i = 0; i < N; i++) {
			int a = 0;
			int b = 0;
			int c = 0;
			for (int j = 0; j < 3 ; j++) {
				String [] input = br.readLine().split(" ");
				a += Integer.parseInt(input[0]);
				b += Integer.parseInt(input[1]);
				c += Integer.parseInt(input[2]);
			}
			int result = a * A + b * B + c * C;
			if(result > max) { max = result; }
		}
		System.out.println(max);
	}
}