import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split("/");

		if ((Integer.parseInt(s[0]) + Integer.parseInt(s[2]) < Integer.parseInt(s[1])) || Integer.parseInt(s[1]) == 0) {
			System.out.println("hasu");
		} else {
			System.out.println("gosu");
		}
	}
}

