import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		switch (line) {
			case "NLCS":
				System.out.println("North London Collegiate School");
				break;
			case "BHA":
				System.out.println("Branksome Hall Asia");
				break;
			case "KIS":
				System.out.println("Korea International School");
				break;
			case "SJA":
				System.out.println("St. Johnsbury Academy");
		}


	}
}