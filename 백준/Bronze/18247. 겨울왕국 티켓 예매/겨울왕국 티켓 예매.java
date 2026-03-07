import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String [] line = br.readLine().split(" ");

			int N = Integer.parseInt(line[0]);
			int M = Integer.parseInt(line[1]);

			if( N >= 12 && M >= 4 ) {
				int cnt = 0;
				for (int j = 0; j < N; j++) {
					for (int k = 0; k < M; k++) {
						cnt++;
						if( j == 11 && k == 3 ) {
							sb.append(cnt).append("\n");
							break;
						}
					}
				}
			} else {
				sb.append(-1).append("\n");
			}
		}
		System.out.print(sb);
	}
}