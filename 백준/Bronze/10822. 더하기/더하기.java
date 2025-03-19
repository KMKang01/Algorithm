import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line = br.readLine().split(",");

		BigInteger bi = BigInteger.ZERO;
		for (String s : line) {
			bi = bi.add(BigInteger.valueOf(Long.parseLong(s)));
		}

		System.out.println(bi.toString());


	}
}