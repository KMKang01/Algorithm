import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();


		String line = br.readLine();
		while(line != null && !line.isEmpty()) {
			int n = Integer.parseInt(line.split(" ")[0]);
			int k = Integer.parseInt(line.split(" ")[1]);

			int count = n;
			while(n >= k) {
				n -= k;
				n++;
				count++;
			}

			sb.append(count).append("\n");

			line = br.readLine();
		}
		System.out.print(sb.toString().trim());


	}
}