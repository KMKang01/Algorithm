import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.IntBinaryOperator;

public class Main {
	public static String AD = "advertise";
	public static String DNM = "does not matter";
	public static String DNA = "do not advertise";

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String[] line = br.readLine().split(" ");
			int r = Integer.parseInt(line[0]);
			int e = Integer.parseInt(line[1]);
			int c = Integer.parseInt(line[2]);
			if (r < e - c) sb.append(AD).append("\n");
			else if (r == e - c) sb.append(DNM).append("\n");
			else if (r > e - c) sb.append(DNA).append("\n");
		}
		System.out.println(sb.toString().trim());
	}
}

