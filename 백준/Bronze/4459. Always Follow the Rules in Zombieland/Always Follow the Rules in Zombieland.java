import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		ArrayList<String> rules=new ArrayList<>();
		for (int i = 0; i < N; i++) {
			rules.add(br.readLine());
		}
		int M = Integer.parseInt(br.readLine());
		for (int i = 0; i < M; i++) {
			int n = Integer.parseInt(br.readLine());
			if( n - 1 >= 0 && n - 1< rules.size() ) {
				sb.append("Rule ").append(n).append(": ").append(rules.get(n-1)).append("\n");
			} else {
				sb.append("Rule ").append(n).append(": ").append("No such rule").append("\n");
			}
		}
		System.out.println(sb.toString().trim());

	}
}

