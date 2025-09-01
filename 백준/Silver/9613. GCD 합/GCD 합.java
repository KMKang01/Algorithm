import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String[] input = br.readLine().split(" ");
			int n = Integer.parseInt(input[0]);

			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(input[j + 1]);
			}

			long sum = 0;

			for (int j = 0; j < n; j++) {
				for (int k = j+1; k < n; k++) {
					sum += gcd(arr[j], arr[k]);
				}
			}
			sb.append(sum).append("\n");
		}

		System.out.println(sb.toString().trim());
	}
		public static int gcd(int a, int b) {
			// a >= b
			int tmp = 0;
			while (b != 0) {
				tmp = a % b;
				a = b;
				b = tmp;
			}
			return a;
		}

}
