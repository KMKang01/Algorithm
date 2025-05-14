import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str1 = br.readLine().split(" ");
		ArrayList<Integer> list = new ArrayList<>();
		Arrays.stream(str1).mapToInt(Integer::parseInt).forEach(list::add);
		Collections.sort(list);

		int a = list.get(0);
		int b = list.get(1);
		int c = list.get(2);

		if (b - a == c - b) {
			System.out.println(c + (b - a));
		} else if (b - a > c - b) {
			System.out.println(a + (c - b));
		} else {
			System.out.println(c - (b - a));
		}
	}
}
