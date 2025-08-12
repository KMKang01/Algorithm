import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] input = br.readLine().split(" ");

		for(String s: input){
			int num = Integer.parseInt(s);
			for (int i = num - 1 ; i > 0 ; i--) {
				sb.append(" ".repeat(num - i - 1)).append("*");
				sb.append(" ".repeat(2 * i -1));
				sb.append("*\n");
			}
			sb.append(" ".repeat(num- 1 )).append("*\n");
		}
		System.out.print(sb.toString().trim());

	}
}
