import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String [] s = br.readLine().split("");

		Map<String, Integer> map = new HashMap<>();

		for(String a: s) {
			if(!(a.equals(" ")||a.equals(",")||a.equals("."))) {
				map.put(a, map.getOrDefault(a, 0) + 1);
			}
		}
		int max = 0;
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			if(entry.getValue() > max) {
				max = entry.getValue();
			}
		}
		System.out.println(max);
	}
}
