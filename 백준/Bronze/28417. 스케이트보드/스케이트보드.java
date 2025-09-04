import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int max = 0;
		for (int i = 0; i < N; i++) {
			String [] line = br.readLine().split(" ");
			int [] runs = new int[2];
			int [] tricks = new int [5];
			for (int j = 0; j < 2; j++) {
				runs[j] = Integer.parseInt(line[j]);
			}
			for (int j = 0; j < 5; j++) {
				tricks[j] = Integer.parseInt(line[j+2]);
			}
			Arrays.sort(runs);
			Arrays.sort(tricks);
			int score = runs[1] + tricks[4] + tricks[3] ;
			max = Math.max(max, score);
		}
		System.out.println(max);
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
