import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		switch ((n) % 3) {
			case 0:
				System.out.println("S");
				break;
			case 1:
				System.out.println("U");
				break;
			case 2:
				System.out.println("O");
				break;
		}

	}
}