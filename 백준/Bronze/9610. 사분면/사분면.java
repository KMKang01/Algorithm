import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int q1 = 0, q2 = 0, q3 = 0, q4 = 0, axis = 0;
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String[] s = br.readLine().split(" ");
			int x = Integer.parseInt(s[0]);
			int y = Integer.parseInt(s[1]);

			if (x == 0 || y == 0) {
				axis++;
			} else if (x > 0 && y > 0) {
				q1++;
			} else if (x < 0 && y > 0) {
				q2++;
			} else if (x < 0 && y < 0) {
				q3++;
			} else if (x > 0 && y < 0) {
				q4++;
			}
		}

		sb.append("Q1: ").append(q1).append("\n");
		sb.append("Q2: ").append(q2).append("\n");
		sb.append("Q3: ").append(q3).append("\n");
		sb.append("Q4: ").append(q4).append("\n");
		sb.append("AXIS: ").append(axis);

		System.out.println(sb);
	}
}
