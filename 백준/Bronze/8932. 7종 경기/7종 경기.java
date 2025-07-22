import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int i = Integer.parseInt(br.readLine());

		for (int j = 0; j < i; j++) {
			String [] arr = br.readLine().split(" ");
			sb.append(getScore(arr)).append("\n");
		}
		System.out.print(sb.toString().trim());
	}

	static int getScore(String[] arr) {
		int score = 0;

		score += (int) Math.floor(9.23076 * Math.pow(26.7 - Double.parseDouble(arr[0]), 1.835));
		score += (int) Math.floor(1.84523 * Math.pow(Double.parseDouble(arr[1]) - 75, 1.348));
		score += (int) Math.floor(56.0211 * Math.pow(Double.parseDouble(arr[2]) - 1.5, 1.05));
		score += (int) Math.floor(4.99087 * Math.pow(42.5 - Double.parseDouble(arr[3]), 1.81));
		score += (int) Math.floor(0.188807 * Math.pow(Double.parseDouble(arr[4]) - 210, 1.41));
		score += (int) Math.floor(15.9803 * Math.pow(Double.parseDouble(arr[5]) - 3.8, 1.04));
		score += (int) Math.floor(0.11193 * Math.pow(254 - Double.parseDouble(arr[6]), 1.88));

		return score;
	}
}