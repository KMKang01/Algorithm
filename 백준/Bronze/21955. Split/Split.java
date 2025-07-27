import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String line = br.readLine();

		System.out.println(line.substring(0, line.length() / 2) + " " + line.substring(line.length() / 2 ));

	}
}