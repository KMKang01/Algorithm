import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		ArrayList<Integer> arrA = new ArrayList<>();
		int[] arrB = new int[N];

		String[] line = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			arrA.add(Integer.parseInt(line[i]));
		}

		Collections.sort(arrA);

		line = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			arrB[i] = Integer.parseInt(line[i]);
		}

		int sum = 0;

		while(arrA.size() != 0) {
			int maxB = Integer.MIN_VALUE;
			int idx = 0;
			for(int i = 0; i < N; i++) {
				if(maxB < arrB[i]) {
					maxB = arrB[i];
					idx = i;
				}
			}
			arrB[idx] = Integer.MIN_VALUE;
			sum += maxB * arrA.remove(0);
		}

		System.out.println(sum);
	}
}
