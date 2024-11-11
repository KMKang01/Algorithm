import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.IntBinaryOperator;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			int sum = 0;
			int min = 0;
			for (int j = 0; j < input.length; j++) {
				int now = Integer.parseInt(input[j]);
				if (now % 2 == 0) {
					sum += now;
					if(min == 0 ) min = now;
					else min = Math.min(now, min);
				}
			}
			sb.append(sum).append(" ").append(min).append("\n");
		}
		System.out.println(sb.toString().trim());
	}
}

