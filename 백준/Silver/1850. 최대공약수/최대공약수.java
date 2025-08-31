import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] input = br.readLine().split(" ");
		BigInteger A = BigInteger.valueOf(Long.parseLong(input[0]));
		BigInteger B = BigInteger.valueOf(Long.parseLong(input[1]));

		BigInteger temp = BigInteger.valueOf(-1L);

		if (A.max(B).equals(A)) {
			while (!temp.equals(BigInteger.ZERO)) {
				temp = A.mod(B);
				A = B;
				B = temp;
			}
			for (long i = 0; i < A.longValue(); i++) {
				sb.append("1");
			}
		} else if (A.equals(B)) {
			for (long i = 0; i < A.longValue(); i++) {
				sb.append("1");
			}
		} else {
			while (!temp.equals(BigInteger.ZERO)) {
				temp = B.mod(A);
				B = A;
				A = temp;
			}
			for (long i = 0; i < B.longValue(); i++) {
				sb.append("1");
			}
		}
		System.out.println(sb.toString());

	}

}
