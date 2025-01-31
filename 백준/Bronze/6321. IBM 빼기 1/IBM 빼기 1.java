import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N  = Integer.parseInt(br.readLine());

		for (int i = 1; i <= N ; i++) {
			String [] line = br.readLine().split("");
			sb.append("String #").append(i).append("\n");
			for(String s : line) {
				if(s.equals("Z")) {
					sb.append("A");
				} else {
					sb.append(Character.toString(s.charAt(0) + 1));
				}
			}
			sb.append("\n\n");
		}
		System.out.println(sb.toString().trim());
	}
}