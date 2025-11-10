import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String line;
		int n = 1;
		while(!(line = br.readLine()).equals("0 0 0")) {
			String [] lineArr = line.split(" ");
			int a = Integer.parseInt(lineArr[0]);
			int b = Integer.parseInt(lineArr[1]);
			int c = Integer.parseInt(lineArr[2]);

			sb.append("Triangle #").append(n++).append("\n");
			if(a == -1) {
				if (c*c - b*b <= 0) {
					sb.append("Impossible.\n");
				} else {
					sb.append("a = ").append(String.format("%.3f", Math.sqrt(c*c - b*b))).append("\n");
				}
			} else if (b == -1) {
				if(c*c - a*a <= 0) {
					sb.append("Impossible.\n");
				} else {
					sb.append("b = ").append(String.format("%.3f", Math.sqrt(c*c - a*a))).append("\n");
				}
			} else if( c == -1) {
				sb.append("c = ").append(String.format("%.3f", Math.sqrt(a*a + b*b))).append("\n");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString().trim());
	}
}