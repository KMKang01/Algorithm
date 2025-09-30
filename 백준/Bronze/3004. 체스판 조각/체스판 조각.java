import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		if (N % 2 == 0) {
			System.out.println((N / 2 + 1) * (N / 2 + 1));
		} else {
			if(N == 1) System.out.println(2);
			else {
				System.out.println((N /2 +1)*( N - N/2+1));
			}
		}
	}
}