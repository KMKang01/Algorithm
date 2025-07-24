import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		int penalty = 0;
		int s_max = 0;

		for (int i = 1; i <= n; i++) {
			String [] line  = br.readLine().split(" ");
			int t = Integer.parseInt(line[0]);
			int s = Integer.parseInt(line[1]);
			if( s > s_max) {
				s_max = s;
				penalty = t + (i - 1) * 20;
			}
		}
		System.out.println(penalty);
	}
}