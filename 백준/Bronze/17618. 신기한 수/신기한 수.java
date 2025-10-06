import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int L = Integer.parseInt(br.readLine());

		int cnt = 0;
		for (int i = 1; i <= L; i++) {
			int num = i;
			int sum = 0;
			while(num > 0) { // 10, 12, 18, 20, 21, 24, 27, 30,
				sum += num % 10;
				num /= 10;
			}
			if(i % sum == 0) cnt++;
		}

		System.out.println(cnt);
	}
}
