import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		if(s.charAt(1) == '0') {
			System.out.println(Integer.parseInt(s.substring(0, 2))+ Integer.parseInt(s.substring(2)));
		} else {
			System.out.println(Integer.parseInt(s.substring(0, 1))+ Integer.parseInt(s.substring(1)));
		}
	}
}

