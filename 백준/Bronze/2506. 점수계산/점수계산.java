import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" ");

		boolean prev = false;
		int score = 0;
		int result = 0;

		for (String s : line) {
			if (s.equals("1")) {
				if (prev) {
					score++;
					result += score;
				} else {
					score++;
					prev = true;
					result += score;
				}
			} else {
				score = 0;
				prev = false;
			}
		}
		System.out.println(result);
	}
}