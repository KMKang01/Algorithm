import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");

		long A = Long.parseLong(s[0]);
		long B = Long.parseLong(s[1]);
		long C = Long.parseLong(br.readLine());

		if(A+B>=2*C) {
			System.out.println(A+B-2*C);
		} else {
			System.out.println(A+B);
		}

	}
}

