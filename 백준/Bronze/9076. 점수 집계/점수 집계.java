import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String [] line = br.readLine().split(" ");
			ArrayList<Integer> list = new ArrayList<>();
			for(String a: line) {
				list.add(Integer.parseInt(a));
			}

			Collections.sort(list);
			
			if(list.get(3) - list.get(1) >= 4) {
				sb.append("KIN\n");
			} else {

				int sum =0;
				sum += list.get(1) + list.get(2) + list.get(3);
				sb.append(sum).append("\n");
			}

		}
		System.out.println(sb.toString().trim());

	}
}
