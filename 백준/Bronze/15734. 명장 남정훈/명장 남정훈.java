import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] line = br.readLine().split(" ");
		int L = Integer.parseInt(line[0]);
		int R = Integer.parseInt(line[1]);
		int A = Integer.parseInt(line[2]);

		int teams;
		if (Math.abs(L - R) <= A) {
			// A로 차이를 메울 수 있음
			teams = (L + R + A) / 2;
		} else {
			// A로 차이를 다 메울 수 없음
			teams = Math.min(L, R) + A;
		}

		System.out.println(teams * 2);
	}
}