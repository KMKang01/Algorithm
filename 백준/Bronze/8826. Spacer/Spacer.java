import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			int Z = Integer.parseInt(br.readLine());

			int countN = 0;
			int countS = 0;
			int countW = 0;
			int countE = 0;
			int n = 0;
			String line = br.readLine();
			for (int j = 0; j < Z; j++) {
				char c = line.charAt(j);
				switch (c) {
					case 'N':
						countN++;
						break;
					case 'S':
						countS++;
						break;
					case 'E':
						countE++;
						break;
					case 'W':
						countW++;
						break;
				}
			}

			n = (Math.max(countN, countS) - Math.min(countN, countS))
					+ (Math.max(countE, countW) - Math.min(countE, countW));

			sb.append(n).append("\n");
		}
		System.out.print(sb);


	}
}