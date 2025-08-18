import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		int T = Integer.MIN_VALUE;
		int B = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			String [] line = br.readLine().split(" ");
			T = Math.max(T, Integer.parseInt(line[0]));
			B = Math.min(B, Integer.parseInt(line[1]));
		}
		System.out.println(T*B%7+1);

	}
}
