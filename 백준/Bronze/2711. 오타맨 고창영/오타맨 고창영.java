import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String [] line = br.readLine().split(" ");
			int index = Integer.parseInt(line[0]);
			String [] words = line[1].split("");
			for (int j = 0; j < words.length; j++) {
				if(j == index - 1) {
					continue;
				}
				sb.append(words[j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}