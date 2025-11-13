import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String line;
		int day = 1;
		while (!(line = br.readLine()).equals("0 0 0")) {
			String [] tokens = line.split(" ");
			int L = Integer.parseInt(tokens[0]);
			int P = Integer.parseInt(tokens[1]);
			int V = Integer.parseInt(tokens[2]);

			int fullCycles = V / P;
			int remainder = V % P;
			int totalDays = fullCycles * L + Math.min(remainder, L);
			sb.append("Case ").append(day++).append(": ").append(totalDays).append("\n");
		}

		System.out.print(sb.toString());
	}
}