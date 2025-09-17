import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int K = Integer.parseInt(line[1]);

		int [] arr = new int[K];

		for (int i = 0; i < K ; i++) {
			arr[i] = N * (i+1);
		}

		int max = -1;

		for (int i = 0; i < K; i++) {
			max = Math.max(max, Integer.parseInt(sb.append(arr[i]).reverse().toString())) ;
			sb = new StringBuilder();
		}

		System.out.println(max);

	}
}