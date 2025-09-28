import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String N = br.readLine();
		BigInteger value = new BigInteger(N, 2);
		value = value.multiply(BigInteger.valueOf(17));
		System.out.println(value.toString(2));
	}
}