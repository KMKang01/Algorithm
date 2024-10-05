import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] a = br.readLine().split("");
		String op = br.readLine();
		String[] b = br.readLine().split("");
		switch (op) {
			case "*":
				sb.append("1");
				for (int i = 0; i < a.length + b.length - 2; i++) {
					sb.append("0");
				}
				break;
			case "+":
				int n = Math.max(a.length, b.length);

				if (a.length == b.length) {
					sb.append("2");
					for (int i = 0; i < n - 1; i++) {
						sb.append("0");
					}
				} else {
					int[] arr = new int[n];
					if (n == a.length) {
						sb.append("1");
						for (int i = 0; i < a.length - 1 - b.length; i++) {
							sb.append("0");
						}
						sb.append("1");
						for (int i = 0; i < b.length - 1; i++) {
							sb.append("0");
						}
					} else {
						sb.append("1");
						for (int i = 0; i < b.length - 1 - a.length; i++) {
							sb.append("0");
						}
						sb.append("1");
						for (int i = 0; i < a.length - 1; i++) {
							sb.append("0");
						}
					}
				}
				break;
		}

		System.out.print(sb);
	}
}