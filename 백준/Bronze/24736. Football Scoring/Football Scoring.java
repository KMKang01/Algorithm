import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line1 = br.readLine().split(" ");
		String[] line2 = br.readLine().split(" ");
		int score1 = 0;
		int score2 = 0;

		for (int i = 0; i < 5; i++) {
			switch (i) {
				case 0:
					score1 += Integer.parseInt(line1[i]) * 6;
					score2 += Integer.parseInt(line2[i]) * 6;
					break;
				case 1:
					score1 += Integer.parseInt(line1[i]) * 3;
					score2 += Integer.parseInt(line2[i]) * 3;
					break;
				case 2:
					score1 += Integer.parseInt(line1[i]) * 2;
					score2 += Integer.parseInt(line2[i]) * 2;
					break;
				case 3:
					score1 += Integer.parseInt(line1[i]) * 1;
					score2 += Integer.parseInt(line2[i]) * 1;
					break;
				case 4:
					score1 += Integer.parseInt(line1[i]) * 2;
					score2 += Integer.parseInt(line2[i]) * 2;
					break;
			}
		}
		System.out.printf("%d %d", score1, score2);
	}
}