import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		BigInteger N = BigInteger.valueOf( Integer.parseInt(br.readLine()));

		BigInteger bi = BigInteger.ZERO;

		for (int i = 1; i <= N.intValue() - 1 ; i++) {
			bi = bi.add(BigInteger.valueOf(i).multiply(N).add(BigInteger.valueOf(i)));
		}

		System.out.println(bi);
	}
}