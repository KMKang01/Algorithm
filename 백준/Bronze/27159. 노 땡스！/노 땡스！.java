import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		String [] line = br.readLine().split(" ");
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < T; i++) {
			arr.add(Integer.parseInt(line[i]));
		}

		int prev = -1;
		int sum = 0;

		for (int i = 0; i < T; i++) {
			if(prev == -1) {
				prev = arr.get(i);
				sum += prev;
			} else {
				if(prev + 1 != arr.get(i)) {
					sum += arr.get(i);
				}
				prev = arr.get(i);
			}
		}

		System.out.println(sum);
	}
}