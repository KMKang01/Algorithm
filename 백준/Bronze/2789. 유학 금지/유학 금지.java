import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String word = br.readLine();

		for (String s : word.split("")) {
			if (!(s.equals("C") || s.equals("A") || s.equals("M") || s.equals("B") || s.equals("R") || s.equals("I") || s.equals("D") || s.equals("G") || s.equals("E"))) {
				sb.append(s);
			}
		}

		System.out.println(sb.toString());

	}
}