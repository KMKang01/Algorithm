import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger n1 = new BigInteger(br.readLine());
		BigInteger n2 = new BigInteger(br.readLine());
		BigInteger x = n1.add(n2).divide(new BigInteger(String.valueOf(2)));
		BigInteger y = x.subtract(n2);
		System.out.print(x+"\n"+y);
	}
}
