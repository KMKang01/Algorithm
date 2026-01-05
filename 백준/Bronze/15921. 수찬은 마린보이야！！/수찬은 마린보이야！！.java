import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		if (N == 0) {
			System.out.println("divide by zero");
		} else {
			HashMap<Integer, Integer> map = new HashMap<>();
			String [] inputs = br.readLine().split(" ");
			for (int i = 0; i < N; i++) {
				int num = Integer.parseInt(inputs[i]);
				map.put(num, map.getOrDefault(num, 0) +1);
			}

			// 평균
			double average = 0;
			for (Integer key : map.keySet()) {
				average += key * map.get(key);
			}
			average /= N;

			// 기댓값
			double expectedValue = 0;
			for (Integer key : map.keySet()) {
				expectedValue += key * (map.get(key) / (double) N);
			}

			double result = average/ expectedValue;
			System.out.println(String.format("%.2f", result));
		}


	}
}