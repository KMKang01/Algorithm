import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line = br.readLine().split(" ");
		int A = Integer.parseInt(line[0]);
		int B = Integer.parseInt(line[1]);

		BigInteger bi = BigInteger.ONE;
		for (int i = A; i <= B ; i++) {
			bi = bi.multiply(BigInteger.valueOf((i*(i+1)/2)));
		}
		bi = bi.mod(BigInteger.valueOf(14579));
		System.out.println(bi);
	}
}