import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			String school = "";
			int max =  0;

			for (int j = 0; j <N; j++) {
				String [] line = br.readLine().split(" ");
				if( Integer.parseInt(line[1]) > max) {
					max = Integer.parseInt(line[1]);
					school = line[0];
				}
			}
			sb.append(school).append("\n");
		}
		System.out.println(sb.toString().trim());

	}
}