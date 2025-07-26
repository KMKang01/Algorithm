import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int i  = Integer.parseInt(br.readLine());
		String [] chs = br.readLine().split("");

		for (int j = 0; j < chs.length; j+=i) {
			sb.append(chs[j]);
		}

		System.out.println(sb.toString());
	}
}