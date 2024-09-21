import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		int K = Integer.parseInt(input[2]);

		int a = M - K;

		HashMap<String, Integer> subjects = new HashMap<>();

		int sum = 0;
		int maxSum = 0;
		int minSum = 0;

		for (int i = 0; i < N; i++) {
			String[] line = br.readLine().split(" ");
			subjects.put(line[0], Integer.parseInt(line[1]));
		}

		for (int i = 0; i < K; i++) {
			String t = br.readLine();
			sum += subjects.remove(t);
		}

		ArrayList<Integer> values = new ArrayList<>(subjects.values().stream()
				.map(Object::toString)
				.map(Integer::parseInt)
				.collect(Collectors.toList()));

		Collections.sort(values);

		maxSum = sum;
		minSum = sum;

		for (int i = 0; i < a; i++) {
			maxSum += values.get(values.size() - 1 - i);
		}

		for (int i = 0; i < a; i++) {
			minSum += values.get(i);
		}

		System.out.printf("%d %d\n", minSum, maxSum);
	}
}