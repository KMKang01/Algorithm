import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int T = Integer.parseInt(line[1]);
		int C = Integer.parseInt(line[2]);
		int P = Integer.parseInt(line[3]);

		int i = 1;
		int count = 0;

		while (i <= N) {

			i += T;
			if (i <= N)
				count += C;
			else break;
		}
		System.out.println(P * count);

	}
}