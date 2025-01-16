import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" ");

		int max = 0;
		for (int i = 0; i < line.length ; i++) {
			max = Math.max(max, Integer.parseInt(line[i]));
		}
		System.out.println(max);

	}
}