import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stringBuilder = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			int s = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			for (int j = 0; j < n ; j++) {
				String [] line = br.readLine().split(" ");
				s += Integer.parseInt(line[0]) * Integer.parseInt(line[1]);
			}

			stringBuilder.append(s).append("\n");
		}
		System.out.println(stringBuilder.toString().trim());


	}
}