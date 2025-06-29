import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		int K = Integer.parseInt(br.readLine());

		switch (K) {
			case 1:
				for (int i = 0; i < N; i++) {
					sb.append(arr[i]).append("\n");
				}
				break;
			case 2:
				for (int i = 0; i < N; i++) {
					StringBuilder sb2 = new StringBuilder();
					sb2.append(arr[i]).reverse();
					sb.append(sb2).append("\n");
				}
				break;
			case 3:
				for (int i = N - 1; i >= 0; i--) {
					sb.append(arr[i]).append("\n");
				}
				break;
		}
		System.out.println(sb.toString().trim());

	}
}


