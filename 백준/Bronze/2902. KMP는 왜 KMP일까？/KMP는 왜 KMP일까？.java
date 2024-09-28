import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String [] names = br.readLine().split("-");
		for(String s: names) sb.append(s.charAt(0));

		System.out.println(sb.toString().trim());
	}
}