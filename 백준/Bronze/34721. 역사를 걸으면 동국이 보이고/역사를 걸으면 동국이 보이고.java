import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int A  = Integer.parseInt(br.readLine());

		for (int i = 0; i < A; i++) {
			sb.append("I love DGU\n");
		}
		System.out.println(sb.toString().trim());
	}
}