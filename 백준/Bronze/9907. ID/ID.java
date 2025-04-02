import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] line = br.readLine().split("");

		int sum = 0;
		sum += 2 * Integer.parseInt(line[0]);
		sum += 7 * Integer.parseInt(line[1]);
		sum += 6 * Integer.parseInt(line[2]);
		sum += 5 * Integer.parseInt(line[3]);
		sum += 4 * Integer.parseInt(line[4]);
		sum += 3 * Integer.parseInt(line[5]);
		sum += 2 * Integer.parseInt(line[6]);
		switch (sum % 11) {
			case 0:
				System.out.println("J");
				break;
			case 1:
				System.out.println("A");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("C");
				break;
			case 4:
				System.out.println("D");
				break;
			case 5:
				System.out.println("E");
				break;
			case 6:
				System.out.println("F");
				break;
			case 7:
				System.out.println("G");
				break;
			case 8:
				System.out.println("H");
				break;
			case 9:
				System.out.println("I");
				break;
			case 10:
				System.out.println("Z");
				break;
		}
	}
}


