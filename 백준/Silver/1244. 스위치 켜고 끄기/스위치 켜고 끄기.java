import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int[] switches = new int[N];
		String[] states = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			switches[i] = Integer.parseInt(states[i]);
		}

		int M = Integer.parseInt(br.readLine());
		for (int i = 0; i < M; i++) {
			String[] line = br.readLine().split(" ");
			String sex = line[0];
			int num = Integer.parseInt(line[1]);

			switch (sex) {
				case "1":
					while (num <= N) {
						switches[num - 1] = switches[num - 1] == 0 ? 1 : 0;
						num += Integer.parseInt(line[1]);
					}
					break;
				case "2":
					num--;
					int left = num - 1;
					int right = num + 1;
					switches[num] = switches[num] == 0 ? 1 : 0;
					while (left >= 0 && right < N && switches[left] == switches[right]) {
						switches[left] = switches[left] == 0 ? 1 : 0;
						switches[right] = switches[right] == 0 ? 1 : 0;
						left--;
						right++;
					}
					break;
			}
		}
		for (int i = 0; i < N; i++) {
			sb.append(switches[i]).append(" ");
			if ((i + 1) % 20 == 0) {
				sb.append("\n");
			}
		}
		System.out.println(sb.toString().trim());
	}
}
