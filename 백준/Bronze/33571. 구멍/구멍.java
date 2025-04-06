import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] ln = br.readLine().split("");
		int count = 0;
		for(String s: ln){
			if(s.matches("[A|a|b|D|d|e|g|O|o|P|p|Q|q|R|@]")) {
				count++;
			} else if (s.matches("[B]"))
				count+=2;
		}
		System.out.println(count);
	}
}

