import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k = Integer.parseInt(br.readLine());
		String [] ln  = br.readLine().split(" ");
		int d1 = Integer.parseInt(ln[0]);
		int d2 = Integer.parseInt(ln[1]);

		double d = (double)(d1- d2) / 2;
		System.out.println( k*k - d*d);


	}
}

