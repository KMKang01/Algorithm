import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int d = Integer.parseInt(br.readLine());
			int count = 0;
			for (int j = 1; j <= d; j++) {
				if (d % j == 0) count++;
			}

			sb.append(d).append(" ").append(count).append("\n");
		}
		System.out.println(sb.toString().trim());
	}
}