import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] N = br.readLine().split(" ");
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < N.length ; i++) {
			list.add(Integer.parseInt(N[i]));
		}
		Collections.sort(list);
		System.out.println(list.get(0) * list.get(2));
	}
}