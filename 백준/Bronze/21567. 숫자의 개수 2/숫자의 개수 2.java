import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());

		BigInteger bi = BigInteger.valueOf(A).multiply(BigInteger.valueOf(B)).multiply(BigInteger.valueOf(C));
		int [] digits = new int[10];

		for(String s: bi.toString().split("")){
			int digit = Integer.parseInt(s);
			digits[digit]++;
		}

		for(int a: digits){
			System.out.println(a);
		}
	}
}


