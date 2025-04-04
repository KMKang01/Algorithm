import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] ln = br.readLine().split("");
		for(String s: ln){
			int code = 0;
			if(s.charAt(0) < 'D') {
				code = s.charAt(0) - 'A' + 'Z' - 2 ;
			} else {
				code = s.charAt(0) - 3 ;
			}
			sb.append((char)code);
		}
		System.out.println(sb.toString().trim());
	}
}

