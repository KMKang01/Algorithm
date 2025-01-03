import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			String[] line = br.readLine().split(" ");
			int N = Integer.parseInt(line[0]);
			int D = Integer.parseInt(line[1]);
			int count = 0;
			for (int j = 0; j < N; j++) {
				String[] spaceship = br.readLine().split(" ");
				int v = Integer.parseInt(spaceship[0]);
				int f = Integer.parseInt(spaceship[1]);
				int c = Integer.parseInt(spaceship[2]);
				if (v * f / c >= D) {
					count++;
				}
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb.toString().trim());
	}
}