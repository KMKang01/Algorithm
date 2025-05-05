import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int i = 1; i <= T; i++) {
			String[] input = br.readLine().split(" ");
			if (input[1].equals("+")) {
				if (Integer.parseInt(input[0]) + Integer.parseInt(input[2]) == Integer.parseInt(input[4])) {
					System.out.printf("Case %d: YES\n", i);
				} else {
					System.out.printf("Case %d: NO\n", i);
				}
			} else if (input[1].equals("-")) {
				if (Integer.parseInt(input[0]) - Integer.parseInt(input[2]) == Integer.parseInt(input[4])) {
					System.out.printf("Case %d: YES\n", i);
				} else {
					System.out.printf("Case %d: NO\n", i);
				}
			}
		}


	}
}

