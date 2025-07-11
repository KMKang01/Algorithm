import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String  [] line1 = br.readLine().split(" ");
		int N = Integer.parseInt(line1[0]);
		int M = Integer.parseInt(line1[1]);

		Set<String> set = new HashSet<String>();

		for (int i = 0; i < N ; i++) {
			set.add(br.readLine());
		}

		int count = 0;

		for (int i = 0; i < M ; i++) {
			count = set.contains(br.readLine()) ? count + 1 : count;
		}
		System.out.println(count);

	}
}


