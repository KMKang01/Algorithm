import java.io.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line = br.readLine().split(" ");
		int a = Integer.parseInt(line[0]);
		int b = Integer.parseInt(line[1]);

		long aW = 0;
		long aSum = 0;
		for (int i = 0; i < line[0].length(); i++) {
			aSum += (line[0].charAt(i) - '0');
		}
		aW = line[0].length() * aSum;

		long bW = 0;
		long bSum = 0;
		for (int i = 0; i < line[1].length(); i++) {
			bSum += (line[1].charAt(i) - '0');
		}
		bW = line[1].length() * bSum;

		System.out.println(aW > bW ? 1 : (aW < bW ? 2 : 0));
	}
}