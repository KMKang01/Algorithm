import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" ");

		int highKill = 0;
		int kills = 0;
		int prev = Integer.parseInt(line[0]);
		for (int i = 1; i < N; i++) {
			int cur = Integer.parseInt(line[i]);
			if (prev > cur) {
				kills++;
			} else {
				highKill = Math.max(highKill, kills);
				kills = 0;
				prev = cur;
			}
		}
		highKill = Math.max(highKill, kills);
		System.out.println(highKill);
	}
}

