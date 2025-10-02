import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] input = br.readLine().split(" ");
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		int c = Integer.parseInt(input[2]);

		if (a + b == c) {
			System.out.printf("%d+%d=%d\n", a, b, c);
		} else if (a - b == c) {
			System.out.printf("%d-%d=%d\n", a, b, c);
		} else if (a * b == c) {
			System.out.printf("%d*%d=%d\n", a, b, c);
		} else if (b != 0 && a / b == c) {
			System.out.printf("%d/%d=%d\n", a, b, c);
		} else if (a == b + c) {
			System.out.printf("%d=%d+%d\n", a, b, c);
		} else if (a == b - c) {
			System.out.printf("%d=%d-%d\n", a, b, c);
		} else if (a == b * c) {
			System.out.printf("%d=%d*%d\n", a, b, c);
		} else if (c != 0 && a == b / c) {
			System.out.printf("%d=%d/%d\n", a, b, c);
		}
	}
}