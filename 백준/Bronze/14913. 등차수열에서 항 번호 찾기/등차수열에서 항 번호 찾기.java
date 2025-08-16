import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] input = br.readLine().split(" ");

		int a = Integer.parseInt(input[0]);
		int d = Integer.parseInt(input[1]);
		int k = Integer.parseInt(input[2]);

		int count = 1;

		if( a <= k ) {
			while (a < k) {
				a += d;
				count++;
			}
		} else {
			while (a > k) {
				a +=d;
				count++;
			}
		}

		if (a == k) {
			System.out.println(count);
		} else {
			System.out.println("X");
		}
	}
}
