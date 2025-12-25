import java.io.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int i = Integer.parseInt(br.readLine());
		sb.append("AKARAKA");
		for (int j = 1; j < i ; j++) {
			sb.append("RAKA");
		}
		System.out.println(sb);
	}
}