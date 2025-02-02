import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String line = br.readLine();

		do {
			int low = 0;
			int up = 0;
			int num = 0;
			int space = 0;
			if(line.equals("")) break;
			for(String a : line.split("")) {
				if(a.charAt(0) >= 'a' && a.charAt(0) <= 'z') {
					low++;
				} else if (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z') {
					up++;
				} else if (a.charAt(0) >= '0' && a.charAt(0) <= '9') {
					num++;
				} else if(a.charAt(0) == ' '){
					space++;
				} else {
					break;
				}
			}
			sb.append(low).append(" ").append(up).append(" ").append(num).append(" ").append(space).append("\n");
			line = br.readLine();
		} while(line != null);

		System.out.println(sb.toString().trim());
	}
}