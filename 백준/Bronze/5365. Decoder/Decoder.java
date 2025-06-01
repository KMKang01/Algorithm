import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		String [] input = br.readLine().split(" ");

		sb.append(input[0].charAt(0));
		int prevLength = input[0].length();

		for (int i = 1; i < n; i++) {
			int curLength = input[i].length();
			if (curLength >= prevLength) {
				sb.append(input[i].charAt(prevLength -1));
			} else {
				sb.append(" ");
			}
			prevLength = curLength;
		}

		System.out.println(sb.toString());
	}
}

