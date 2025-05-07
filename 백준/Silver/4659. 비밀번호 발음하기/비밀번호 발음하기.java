import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String line = br.readLine();

		while (!line.equals("end")) {
			boolean isValid = true;
			boolean isGatherInclude = false;
			int gatherCount = 0;
			int consonantCount = 0;
			String prev = "";
			for (int i = 0; i < line.length(); i++) {
				String cur = Character.toString(line.charAt(i));
				if (line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o' || line.charAt(i) == 'u') {
					isGatherInclude = true;
					gatherCount++;
					consonantCount = 0;
					if (gatherCount == 3) {
						isValid = false;
						break;
					}
					if (prev.equals(cur)) {
						if (!(prev.equals("e") && cur.equals("e") || prev.equals("o") && cur.equals("o"))) {
							isValid = false;
							break;
						}
					}
				} else {
					consonantCount++;
					gatherCount = 0;
					if (prev.equals(cur) || consonantCount == 3) {
						isValid = false;
						break;
					}
				}
				prev = Character.toString(line.charAt(i));
			}
			if (isValid && isGatherInclude) {
				sb.append("<").append(line).append(">").append(" is acceptable.\n");
			} else {
				sb.append("<").append(line).append(">").append(" is not acceptable.\n");
			}
			line = br.readLine();
		}

		System.out.println(sb.toString().trim());
	}
}

