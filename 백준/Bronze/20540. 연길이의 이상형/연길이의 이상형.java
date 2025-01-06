import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split("");
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 4; i++) {
			switch (input[i]) {
				case "E":
					sb.append("I");
					break;
				case "I":
					sb.append("E");
					break;
				case "S":
					sb.append("N");
					break;
				case "N":
					sb.append("S");
					break;
				case "T":
					sb.append("F");
					break;
				case "F":
					sb.append("T");
					break;
				case "P":
					sb.append("J");
					break;
				case "J":
					sb.append("P");
					break;
			}
		}

		System.out.println(sb);

	}
}