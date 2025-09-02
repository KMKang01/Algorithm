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

			int [] arr = new int[input.length];
			for (int j = 0; j < input.length; j++) {
				arr[j] = Integer.parseInt(input[j ]);
			}

			long max = 0;

			for (int j = 0; j < input.length; j++) {
				for (int k = j+1; k < input.length; k++) {
					max = Math.max(max, gcd(arr[j], arr[k]));
				}
			}
			sb.append(max).append("\n");
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
