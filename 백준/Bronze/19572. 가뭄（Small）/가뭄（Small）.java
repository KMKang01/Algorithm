import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line = br.readLine().split(" ");
		int d1=Integer.parseInt(line[0]);
		int d2=Integer.parseInt(line[1]);
		int d3=Integer.parseInt(line[2]);

		// a + b = d1
		// a + c = d2
		// b + c = d3
		double c = (d2 + d3 - d1) / 2.0;
		double a = d2 - c;
		double b = d1 - a;

		if(a > 0 && b > 0 && c > 0) {
			sb.append("1\n");
			sb.append(String.format("%.1f", a)).append(" ").append(String.format("%.1f", b)).append(" ").append(String.format("%.1f", c));
		} else {
			sb.append("-1\n");
		}
		System.out.println(sb.toString().trim());
	}
}