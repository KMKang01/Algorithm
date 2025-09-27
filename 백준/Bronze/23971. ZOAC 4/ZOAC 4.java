import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] line = br.readLine().split(" ");
		int H = Integer.parseInt(line[0]);
		int W = Integer.parseInt(line[1]);
		int N = Integer.parseInt(line[2]);
		int M = Integer.parseInt(line[3]);

		int count = 0;
		for (int i = 0; i < H; i += (N + 1)) {
			for (int j = 0; j < W; j += (M + 1)) {
				count++;
			}
		}

		count = count == 0 ? 1: count;

		System.out.println(count);
	}
}