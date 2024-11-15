import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String line = "";
		while (true) {
			line = br.readLine();
			if (line.equals("#")) break;
			String[] tokens = line.split("");
			int sum = 0;
			for (int i = 0; i < tokens.length; i++) {
				sum += getNum(tokens[i]) * (int) Math.pow(8, tokens.length - i - 1);
			}
			sb.append(sum).append("\n");
		}

		System.out.println(sb.toString().trim());
	}

	static int getNum(String a) {
		switch (a) {
			case "-":
				return 0;
			case "\\":
				return 1;
			case "(":
				return 2;
			case "@":
				return 3;
			case "?":
				return 4;
			case ">":
				return 5;
			case "&":
				return 6;
			case "%":
				return 7;
			case "/":
				return -1;
			default:
				return 0;
		}
	}
}