import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		int year = 2024;
		int month = 8;

		for (int i = 1; i < N; i++) {
			month += 7;
			if(month > 12) {
				month -= 12;
				year += 1;
			}
		}

		System.out.println(year + " " + month);
	}
}
