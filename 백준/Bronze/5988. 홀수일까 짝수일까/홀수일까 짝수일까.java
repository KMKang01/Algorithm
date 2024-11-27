import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stringBuilder = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			if (Integer.parseInt(Character.toString(line.charAt(line.length() - 1)))%2 == 0) stringBuilder.append("even\n");
			else stringBuilder.append("odd\n");
		}
		System.out.println(stringBuilder.toString().trim());

	}
}
