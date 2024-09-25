import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] rewards = new int[N];
		for (int i = 0; i < N; i++) {
			String[] line = br.readLine().split(" ");
			if (line[0].equals(line[1]) && line[1].equals(line[2])) {
				rewards[i] = 10000 + Integer.parseInt(line[0]) * 1000;
			} else if (line[0].equals(line[1]) && !line[0].equals(line[2])) {
				rewards[i] = 1000 + Integer.parseInt(line[0]) * 100;
			} else if (line[0].equals(line[2]) && !line[0].equals(line[1])) {
				rewards[i] = 1000 + Integer.parseInt(line[0]) * 100;
			} else if (line[1].equals(line[2]) && !line[1].equals(line[0])) {
				rewards[i] = 1000 + Integer.parseInt(line[1]) * 100;
			} else {
				int tmp = Math.max(Integer.parseInt(line[0]), Integer.parseInt(line[1]));
				tmp = Math.max(tmp, Integer.parseInt(line[2]));
				rewards[i] = tmp * 100;
			}
		}
		int res = 0;
		for(int a: rewards) {

			res = Math.max(res, a);
		}
		System.out.println(res);
	}
}
