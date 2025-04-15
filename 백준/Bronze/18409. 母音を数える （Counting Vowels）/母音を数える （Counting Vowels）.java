import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String [] S = br.readLine().split("");

		int count = 0;
		for(String s: S) {
			if(s.equals("a")||s.equals("e")||s.equals("i")||s.equals("o")||s.equals("u")) {count++;}
		}
		System.out.println(count);
	}
}

