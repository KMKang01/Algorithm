import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String [] arr = br.readLine().split(" ");
		ArrayList<Integer> list = new ArrayList<>();
		for (String s : arr) {
			list.add(Integer.parseInt(s));
		}
		Collections.sort(list);
		int max = list.get(list.size() - 1);
		int min = list.get(0);
		System.out.println(max - min);
	}
}


