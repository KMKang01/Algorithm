import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		int claps = 0;
		for (int i = 1; i <= N; i++) {
			int num = i;
			while (num > 0) {
				int digit = num % 10;
				if (digit == 3 || digit == 6 || digit == 9) {
					claps++;
				}
				num /= 10;
			}
		}

		System.out.println(claps);
	}
}