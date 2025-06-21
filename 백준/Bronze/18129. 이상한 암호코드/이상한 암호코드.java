import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] input = br.readLine().split(" ");
		String S = input[0].toLowerCase();
		int K = Integer.parseInt(input[1]);

		while (S.length() > 0) {
			String ch = S.substring(0, 1);
			if (S.length() >= K && S.substring(0, K).equals(ch.repeat(K))) {
				sb.append(1);
			} else {
				sb.append(0);
			}
			S = S.replaceAll(ch, "");
		}

		System.out.println(sb.toString());
	}
}
