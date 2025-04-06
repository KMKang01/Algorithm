import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String ln = br.readLine();

		while(!ln.equals("#")) {
			int count = 0;
			for(String s: ln.split("")) {
				if(s.matches("[a|e|i|o|u|A|E|I|O|U]")) count++;
			}
			System.out.println(count);
			ln = br.readLine();
		}
	}
}

