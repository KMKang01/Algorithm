import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String [] line = br.readLine().split("");
			int count = 0;
			for (int j = 0; j < line.length - 2; j++) {
				if(line[j].equals("W") && line[j+1].equals("O") && line[j+2].equals("W")){
					count++;
				}
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb.toString().trim());
	}
}
