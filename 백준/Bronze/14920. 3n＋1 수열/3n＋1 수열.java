import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int count = 1;
		while(N != 1) {
			if(N % 2 == 0) {
				N /= 2;
			} else {
				N = 3 * N + 1;
			}

			count++;
		}
		System.out.println(count);
	}
}