import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		// b^2 + (T/2)^2 = a^2
		int result =(int)Math.round( Math.pow(T / 2.0, 2));
		System.out.println(result);

	}
}

