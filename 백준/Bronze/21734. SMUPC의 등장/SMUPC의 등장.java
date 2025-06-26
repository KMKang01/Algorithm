import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] line = br.readLine().split("");

		StringBuilder sb = new StringBuilder();
		for(String s: line) {
			int codeNum = 0;
			String charCode = Integer.toString( s.charAt(0));
			for(String a : charCode.split("")) {
				codeNum += Integer.parseInt(a);
			}
			sb.append(s.repeat(codeNum)).append("\n");
		}
		System.out.println(sb.toString().trim());
	}
}


