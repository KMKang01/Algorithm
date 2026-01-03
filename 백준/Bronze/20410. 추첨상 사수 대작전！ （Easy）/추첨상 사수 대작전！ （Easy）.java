import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] line = br.readLine().split(" ");
		int m = Integer.parseInt(line[0]);
		int seed = Integer.parseInt(line[1]);
		int x1 = Integer.parseInt(line[2]);
		int x2 = Integer.parseInt(line[3]);

		int a = 0;
		int c = 0;
		while (x1 != (a * seed + c) % m || x2 != (a * x1 + c) % m) {
			if (c < m - 1) c++;
			else {
				c = 0;
				a++;
			}
		}

		System.out.println(a + " " + c);
	}
}