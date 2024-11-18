import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.BitSet;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] line = br.readLine().split(" ");
		String num1 = line[0];
		String num2 = line[1];
		if (num1.length() < num2.length()) {
			for (int i = 0; i < num2.length() - num1.length(); i++) {
				sb.append("0");
			}
			sb.append(num1);
			num1 = sb.toString();
			sb = new StringBuilder();
		} else if (num2.length() < num1.length()) {
			for (int i = 0; i < num1.length() - num2.length(); i++) {
				sb.append("0");
			}
			sb.append(num2);
			num2 = sb.toString();
			sb = new StringBuilder();
		}

		int accumulator = 0;
		for (int i = num1.length() - 1; i >= 0; i--) {
			int a = Integer.parseInt(String.valueOf(num1.charAt(i)));
			int b = Integer.parseInt(String.valueOf(num2.charAt(i)));
			switch (a + b + accumulator) {
				case 3:
					accumulator = 1;
					sb.append("1");
					break;
				case 2:
					accumulator = 1;
					sb.append("0");
					break;
				case 1:
					accumulator = 0;
					sb.append("1");
					break;
				case 0:
					accumulator = 0;
					sb.append("0");
					break;
			}
		}
		if (accumulator != 0) {
			sb.append("1");
		}
		int idx = 0;
		String result = sb.reverse().toString();
		for (String a : result.split("")) {
			if (a.equals("0")) idx++;
			else break;
		}

		result = result.substring(idx);

		if(!result.isEmpty()) System.out.println(result);
		else System.out.println("0");
	}
}