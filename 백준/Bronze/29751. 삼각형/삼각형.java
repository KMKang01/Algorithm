import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		double a = Double.parseDouble(line[0]);
		double b = Double.parseDouble(line[1]);
		double S = a * b / 2 ;
		System.out.printf("%.1f", S);

	}
}