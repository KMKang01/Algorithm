import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k = Integer.parseInt(br.readLine());

		String [] str = br.readLine().split("");

		int countE = 0;
		int count2 = 0;

		for(String s: str) {
			if(s.equals("e")) countE++;
			else count2++;
		}

		if(countE == count2) System.out.println("yee");
		else if (countE > count2) System.out.println('e');
		else if (count2 > countE) System.out.println(2);
	}
}

