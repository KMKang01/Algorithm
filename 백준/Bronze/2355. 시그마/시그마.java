import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] ab = br.readLine().split(" ");
		long a = Integer.parseInt(ab[0]);
		long b = Integer.parseInt(ab[1]);

		long sum = 0;

		if (Math.min(a, b) == a) {
			sum = (b * (b + 1) / 2) - (a * (a + 1) / 2) + a;
		} else {
			sum = (a * (a + 1) / 2) - (b * (b + 1) / 2) + b;
		}


		System.out.println(sum);
	}
}