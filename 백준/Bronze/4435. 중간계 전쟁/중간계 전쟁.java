import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String [] line1 = br.readLine().split(" ");
			String [] line2 = br.readLine().split(" ");

			int gandalf = 0;
			gandalf = Integer.parseInt(line1[0]) * 1 +
				Integer.parseInt(line1[1]) * 2 +
				Integer.parseInt(line1[2]) * 3 +
				Integer.parseInt(line1[3]) * 3 +
				Integer.parseInt(line1[4]) * 4 +
				Integer.parseInt(line1[5]) * 10;
			int sauron = 0;
			sauron = Integer.parseInt(line2[0]) * 1 +
				Integer.parseInt(line2[1]) * 2 +
				Integer.parseInt(line2[2]) * 2 +
				Integer.parseInt(line2[3]) * 2 +
				Integer.parseInt(line2[4]) * 3 +
				Integer.parseInt(line2[5]) * 5 +
				Integer.parseInt(line2[6]) * 10;

			sb.append("Battle ").append(i + 1).append(": ");
			if (gandalf > sauron) {
				sb.append("Good triumphs over Evil").append("\n");
			} else if (gandalf < sauron) {
				sb.append("Evil eradicates all trace of Good\n");
			} else {
				sb.append("No victor on this battle field\n");
			}
		}
		System.out.println(sb.toString().trim());
	}
}