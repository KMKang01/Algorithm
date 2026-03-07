import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		long result = 0;
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			int pot = Integer.parseInt(String.valueOf(line.charAt(line.length() - 1)));
			int P = Integer.parseInt(line.substring(0, line.length() - 1));
			result += Math.pow(P, pot);
		}
		System.out.println(result);
	}
}