import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			String [] line = br.readLine().split(" ");
			for (int j = 0; j < line.length; j++) {
				list.add(Integer.parseInt(line[j]));
			}
			Collections.sort(list);
			sb.append(list.get(7)).append("\n");

			list.clear();
		}

		System.out.println(sb.toString().trim());

	}
}