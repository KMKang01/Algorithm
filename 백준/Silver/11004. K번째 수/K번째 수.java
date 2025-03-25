import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int K = Integer.parseInt(line[1]);

		line = br.readLine().split(" ");
		ArrayList<Integer> list = new ArrayList<>();

		for(String s: line) {
			list.add(Integer.parseInt(s));
		}

		Collections.sort(list);
		System.out.println(list.get(K -1 ));
	}
}