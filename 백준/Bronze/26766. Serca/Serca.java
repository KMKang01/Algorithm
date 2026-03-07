import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		sb.append(" @@@   @@@ \n");
		sb.append("@   @ @   @\n");
		sb.append("@    @    @\n");
		sb.append("@         @\n");
		sb.append(" @       @ \n");
		sb.append("  @     @  \n");
		sb.append("   @   @   \n");
		sb.append("    @ @    \n");
		sb.append("     @     \n");

		String heart = sb.toString();

		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			System.out.print(heart);
		}
	}
}