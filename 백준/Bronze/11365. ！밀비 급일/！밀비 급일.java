import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String ln = br.readLine();

		while(!ln.equals("END")) {
			StringBuilder sb = new StringBuilder();
			System.out.println(sb.append(ln).reverse());
			ln = br.readLine();
		}
	}
}

