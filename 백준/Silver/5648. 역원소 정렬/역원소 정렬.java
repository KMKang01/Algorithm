import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Long> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(scanner.nextLong());
		}
		ArrayList<Long> newIntList = new ArrayList<>();
		for(long num : list) {
			StringBuilder sb = new StringBuilder().append(num).reverse();
			long a = Long.parseLong(sb.toString());
			newIntList.add(a);
		}
		Collections.sort(newIntList);
		for(long num : newIntList) {
			System.out.println(num);
		}
	}
}

