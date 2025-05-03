import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String [] str1 = br.readLine().split(" ");
		String [] str2 = br.readLine().split(" ");

		List<String> l1 = new ArrayList<>();
		List<String> l2 = new ArrayList<>();

		for(String s: str1) {
			l1.add(s);
		}

		for(String s: str2) {
			l2.add(s);
		}

		String answer = "";
		
		for(String s: l1) {
			if(!l2.contains(s)) {
				answer = s;
				break;
			}
		}

		System.out.println(answer);
	}
}
