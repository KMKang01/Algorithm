import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

//		BigInteger b = new BigInteger("123412342998259893295123412342998259893295123412342998259893295000008829348234");
//		System.out.println(b.mod(BigInteger.valueOf(3)));

		String N = br.readLine();
		// 1. N에 0이 없으면 -1
		if (!N.contains("0")) {
			System.out.println(-1);
		} else {
			// 2. N의 각 자리수를 더해서 3의 배수인지 확인
			int sum = 0;
			for (int i = 0; i < N.length(); i++) {
				sum += N.charAt(i) - '0';
			}
			// 3. 3의 배수가 아니면 -1
			if (sum % 3 != 0) {
				System.out.println(-1);
			} else {
				// 4. 모든 자리수를 내림차순으로 정렬
				char[] digits = new char[N.length()];
				for (int i = 0; i < N.length(); i++) {
					digits[i] = N.charAt(i);
				}
				Arrays.sort(digits);

				// 5. 내림차순으로 출력 (배열을 역순으로)
				for (int i = digits.length - 1; i >= 0; i--) {
					sb.append(digits[i]);
				}

				System.out.println(sb.toString());
			}
		}
	}
}