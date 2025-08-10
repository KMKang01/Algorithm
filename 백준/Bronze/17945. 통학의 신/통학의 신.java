import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] input = br.readLine().split(" ");
		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);
		// -b + sqrt(b^2 - 4ac) / 2a

		int a = 1;
		int b = 2 * A;
		int c = B;

		int x1 = (-b + (int) Math.sqrt(b * b - 4 * a * c) )/ (2 * a);
		int x2 = (-b - (int) Math.sqrt(b * b - 4 * a * c) )/ (2 * a);

		System.out.println(x1 == x2 ? x1 : x2 + " " + x1);
	}
}
