import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder();
		StringBuilder sb4 = new StringBuilder();
		StringBuilder sb5 = new StringBuilder();
		String A = br.readLine();
		String B = br.readLine();

		for (int i = 0; i < A.length(); i++) {
			int a = Integer.parseInt(Character.toString( A.charAt(i)));
			int b = Integer.parseInt(Character.toString( B.charAt(i)));
			sb.append(a&b);
			sb2.append(a|b);
			sb3.append(a^b);
			sb4.append(a == 1 ? 0 : 1);
			sb5.append(b == 1 ? 0 : 1);
		}

		sb.append('\n').append(sb2).append('\n').append(sb3).append('\n').append(sb4).append('\n').append(sb5);
		System.out.println(sb.toString());
	}
}


