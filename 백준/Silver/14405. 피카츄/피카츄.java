import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] S = br.readLine().split("");

		for (int i = 0; i < S.length - 1; i++) {
			if(S[i].equals("p") && S[i + 1].equals("i")) {
				S[i] = "";
				S[i + 1] = "";
			} else if (S[i].equals("k") && S[i + 1].equals("a")) {
				S[i] = "";
				S[i + 1] = "";
			} else if ((i <= S.length - 3) && S[i].equals("c") && S[i + 1].equals("h") && S[i + 2].equals("u")) {
				S[i] = "";
				S[i + 1] = "";
				S[i + 2] = "";
			}
		}

		boolean isPikachu = true;
		for(String c: S) {
			if (!c.isEmpty()) {
				isPikachu = false;
				break;
			}
		}

		if(isPikachu) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}