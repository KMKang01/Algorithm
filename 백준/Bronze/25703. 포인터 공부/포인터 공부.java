import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		sb.append("int a;\n");
		for (int i = 1; i <= N; i++) {
			if (i == 1) sb.append("int ").append("*".repeat(i)).append("ptr = &a;\n");
			else sb.append("int ").append("*".repeat(i)).append("ptr").append(i).append(" = &").append("ptr").append(i-1 == 1? "":i-1).append(";\n");
		}

		System.out.println(sb.toString().trim());
	}
}