import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		if(T == 1 ) {
			System.out.println("*");
		} else {
			StringBuilder star = new StringBuilder();
			String first = "* ".repeat((int)Math.ceil(T/2.0));
			String second = " *".repeat((int)Math.floor(T/2.0));
			star.append(first).append("\n").append(second);
			for (int i = 0; i < T; i++) {
				sb.append(star.toString()).append("\n");
			}
			System.out.println(sb.toString().trim());
		}
	}
}
