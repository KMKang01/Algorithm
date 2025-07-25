import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] input = br.readLine().split(" ");
		BigInteger a = new BigInteger(input[0]);
		BigInteger b = new BigInteger(input[1]);
		System.out.println(a.divide(b));
		System.out.println(a.mod(b));

	}
}