import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		sb.append("@@@");
		for (int i = 0; i < N - 1; i++) {
			sb.append("@");
		}
		sb.append("\n");
		for (int i = 0; i < N ; i++) {
			sb.append("@");
			for (int j = 0; j < N ; j++) {
				sb.append(" ");
			}
			sb.append("@\n");
		}
		sb.append("@@@");
		for (int i = 0; i < N - 1; i++) {
			sb.append("@");
		}
		System.out.println(sb.toString().trim());
	}
}


