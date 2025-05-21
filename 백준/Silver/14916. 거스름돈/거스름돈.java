import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());

		int rem5 = a / 5;
		int rem2 = 0;
		while (rem5 >= 0) {
			if ((a - rem5 * 5) % 2 == 0) {
				rem2 = (a - rem5 * 5) / 2;
				break;
			} else {
				rem5--;
			}
		}

		if (rem5 * 5 + rem2 * 2 == a) {
			System.out.println(rem5 + rem2);
		} else {
			System.out.println(-1);
		}

	}
}