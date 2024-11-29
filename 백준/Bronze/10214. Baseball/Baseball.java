import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stringBuilder = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			int yScore = 0;
			int kScore = 0;
			for (int j = 0; j < 9; j++) {
				String[] line = br.readLine().split(" ");
				int a = Integer.parseInt(line[0]);
				int b = Integer.parseInt(line[1]);
				yScore += a;
				kScore += b;
			}
			if (yScore > kScore) stringBuilder.append("Yonsei\n");
			else if (kScore > yScore) stringBuilder.append("Korea\n");
			else stringBuilder.append("Draw\n");
		}
		System.out.println(stringBuilder.toString().trim());
	}
}