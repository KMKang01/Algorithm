import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String[] line = br.readLine().split("-");
			int frontSum = 0;
			for (int j = 0; j < line[0].length(); j++) {
				frontSum += (line[0].charAt(j) - 'A') * (int) Math.pow(26, 2 - j);
			}
			int back = Integer.parseInt(line[1]);

			if (Math.abs(frontSum - back) <= 100) {
				sb.append("nice\n");
			} else {
				sb.append("not nice\n");
			}
		}
		System.out.print(sb.toString().trim());
	}
}


