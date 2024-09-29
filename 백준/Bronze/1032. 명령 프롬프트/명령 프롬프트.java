import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		String[][] files = new String[N][];
		for (int i = 0; i < N; i++) {
			files[i] = br.readLine().split("");
		}

		int length = files[0].length;
		boolean isEqual = true;

		for (int i = 0; i < length; i++) {
			String s = files[0][i];
			for (int j = 1; j < N; j++) {
				if (!s.equals(files[j][i])) {
					isEqual = false;
					break;
				}
			}
			if (isEqual) {
				sb.append(s);
			} else {
				sb.append('?');
			}
			isEqual = true;
		}

		System.out.println(sb);
	}
}