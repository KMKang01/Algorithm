import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();

		while (!input.equals("#")) {
			input = input.toLowerCase();
			String divider = Character.toString(input.charAt(0));
			int count = 0;
			for (int i = 1; i < input.length() ; i++) {
				String s = Character.toString(input.charAt(i));
				if(s.equals(divider)) count++;
			}

			if (count == -1) count = 0;
			sb.append(divider).append(" ").append(count).append("\n");
			input = br.readLine();
		}

		System.out.println(sb.toString().trim());
	}
}

