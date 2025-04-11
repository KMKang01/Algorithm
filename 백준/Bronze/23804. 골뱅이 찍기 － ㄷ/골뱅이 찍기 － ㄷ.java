import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k = Integer.parseInt(br.readLine());

		String p = "";
		for (int i = 0; i < k; i++) {
			p += "@";
		}

		for (int i = 0; i < k; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(p);
			}
			System.out.println();
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < k ; j++) {
				System.out.println(p);
			}
		}

		for (int i = 0; i < k; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(p);
			}
			System.out.println();
		}
	}
}

