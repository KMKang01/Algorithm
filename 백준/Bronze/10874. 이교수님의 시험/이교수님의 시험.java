import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		int [] A = {1,2,3,4,5,1,2,3,4,5};
		for (int i = 0; i < T; i++) {
			String [] line = br.readLine().split(" ");
			int cnt = 0;
			for(int j = 0; j < line.length; j++) {
				if(A[j] == Integer.parseInt(line[j])) {
					cnt++;
				}
			}
			if(cnt == 10) sb.append(i+1).append("\n");
		}

		System.out.println(sb.toString().trim());

	}
}