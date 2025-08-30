import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line1 = br.readLine().split(" ");
		int a1 = Integer.parseInt(line1[0]);
		int a2 = Integer.parseInt(line1[1]);

		String [] line2 = br.readLine().split(" ");
		int b1 = Integer.parseInt(line2[0]);
		int b2 = Integer.parseInt(line2[1]);

		int denom = a2 * b2;
		int numer = a1 * b2 + b1 * a2;

		int gcd = gcd(denom, numer);

		if(gcd == 1){
			System.out.println(numer + " " + denom);
		} else {
			System.out.println((numer / gcd) + " " + (denom / gcd));
		}

	}

	public static int gcd(int a, int b){
		// a must-be greater than b
		int temp = Integer.MIN_VALUE;
		while(temp != 0){
			temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}
}
