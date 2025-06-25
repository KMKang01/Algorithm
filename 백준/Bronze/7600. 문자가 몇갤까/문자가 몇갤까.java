import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String line = br.readLine().toLowerCase();
		while (!line.equals("#")) {
			int count = 0;

			boolean[] alphabet = new boolean[26];
			for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				if (c >= 'a' && c <= 'z') {
					alphabet[c - 'a'] = true;
				}
			}

			for(boolean b : alphabet) {
				if (b) {
					count++;
				}
			}

			sb.append(count).append("\n");
			line = br.readLine().toLowerCase();
		}

		System.out.println(sb.toString().trim());
	}
}


