import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append("@");
			}
			sb.append("\n");
		}
		String p = sb.toString().trim();

		System.out.println(p);
		System.out.println(p);
		System.out.println(p);
		System.out.println(p);

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N * 5; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}
}

