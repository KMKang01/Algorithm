import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.IntBinaryOperator;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb1 = new StringBuilder(br.readLine());
		StringBuilder sb2 = new StringBuilder();

		if (sb1.length() % 3 == 1) {
			sb1.insert(0, "00");
		} else if (sb1.length() % 3 == 2) {
			sb1.insert(0, "0");
		}

		String binary = sb1.toString();
		for (int i = 0; i < binary.length() - 1; i += 3) {
			String word = binary.substring(i, i + 3);
			switch (word) {
				case "000":
					sb2.append(0);
					break;
				case "001":
					sb2.append(1);
					break;
				case "010":
					sb2.append(2);
					break;
				case "011":
					sb2.append(3);
					break;
				case "100":
					sb2.append(4);
					break;
				case "101":
					sb2.append(5);
					break;
				case "110":
					sb2.append(6);
					break;
				case "111":
					sb2.append(7);
					break;
			}
		}
		System.out.println(sb2.toString());
	}
}

