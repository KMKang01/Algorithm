import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();

		ArrayList<Integer> list = new ArrayList<>();

		String line  = br.readLine();
		while(line != null && !line.isEmpty()) {
			for(String s : line.split(" ")) {
				list.add(Integer.parseInt(s));
			}
			line = br.readLine();
		}

		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = i +1; j < list.size(); j++) {
				max = Math.max(max, gcd(list.get(i), list.get(j)));
			}
		}
		System.out.println(max);
	}
		public static int gcd(int a, int b) {
			// a >= b
			int tmp = 0;
			while (b != 0) {
				tmp = a % b;
				a = b;
				b = tmp;
			}
			return a;
		}

}
