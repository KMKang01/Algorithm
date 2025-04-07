import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String ln = br.readLine();
		while(!ln.equals("0")) {
			int i = Integer.parseInt(ln);
			int sum = 0;
			for (int j = 1; j <= i; j++) {
				sum += j*j;
			}
			System.out.println(sum);
			ln = br.readLine();
		}

	}
}

