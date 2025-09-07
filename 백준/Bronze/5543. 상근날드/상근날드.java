import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(br.readLine());

		int minBurger = Math.min(Math.min(a, b), c);
		int minDrink = Math.min(d, e);

		System.out.println(minBurger + minDrink - 50);
		



	}


}
