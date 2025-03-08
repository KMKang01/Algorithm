import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int K = Integer.parseInt(br.readLine());

		for (int i = 0; i < K; i++) {
			String[] line = br.readLine().split(" ");
			ArrayList<Integer> arr = new ArrayList<>();
			for (String s : line) arr.add(Integer.parseInt(s));

			int N = arr.remove(0);
			arr.sort(Collections.reverseOrder());

//			System.out.println(arr);

			int max = Collections.max(arr);
			int min = Collections.min(arr);
			int largestGap = 0;
			for (int j = 0; j < arr.size() - 1; j++) {
				largestGap = Math.max(largestGap, arr.get(j) - arr.get(j + 1));
			}

			sb.append("Class ").append(i + 1).append("\n");
			sb.append(String.format("Max %d, Min %d, Largest gap %d\n", max, min, largestGap));
		}
		System.out.println(sb.toString().trim());

	}
}