import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String [] str1 = br.readLine().split(" ");
		String [] str2 = br.readLine().split(" ");

		double c = 0;
		double h = 0;

		c += Integer.parseInt(str1[0]) * 13;
		h += Integer.parseInt(str2[0]) * 13;

		c += Integer.parseInt(str1[1]) * 7;
		h += Integer.parseInt(str2[1]) * 7;

		c += Integer.parseInt(str1[2]) * 5;
		h += Integer.parseInt(str2[2]) * 5;

		c += Integer.parseInt(str1[3]) * 3;
		h += Integer.parseInt(str2[3]) * 3;

		c += Integer.parseInt(str1[4]) * 3;
		h += Integer.parseInt(str2[4]) * 3;

		c += Integer.parseInt(str1[5]) * 2;
		h += Integer.parseInt(str2[5]) * 2;

		h += 1.5;

		System.out.println( c > h ? "cocjr0208" : "ekwoo" );


	}
}

