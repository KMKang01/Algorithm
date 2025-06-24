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

		String[] input = br.readLine().split(" ");

		List<String> ignoreList = Arrays.asList("i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili");

		for (int i = 0; i < input.length; i++) {
			if (i == 0) sb.append(Character.toString(input[i].charAt(0)).toUpperCase());
			else {
				String word = input[i];
				if (!ignoreList.contains(word)) sb.append(Character.toString(input[i].charAt(0)).toUpperCase());
			}
		}
		System.out.println(sb.toString());
	}
}


