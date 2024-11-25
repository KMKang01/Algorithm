import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] firstLine = br.readLine().split(" ");
		int N = Integer.parseInt(firstLine[0]);
		int W = Integer.parseInt(firstLine[1]);
		int H = Integer.parseInt(firstLine[2]);
		double diagonal = Math.sqrt(Math.pow(W, 2) + Math.pow(H, 2));
		for (int i = 0; i < N; i++) {
			int length = Integer.parseInt(br.readLine());
			if (diagonal >= length) {
				sb.append("DA\n");
			} else {
				sb.append("NE\n");
			}
		}
		System.out.print(sb.toString().trim());

	}
}