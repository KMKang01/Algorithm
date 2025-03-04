import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String input = br.readLine();
		boolean isSeven = false;
		isSeven = input.contains("7");

		int n = Integer.parseInt(input);
		boolean isDivisible = false;
		isDivisible = n % 7 == 0;

		if (isDivisible && isSeven) {
			System.out.println("3");
		} else if (isDivisible ) {
			System.out.println("1");
		} else if ( isSeven) {
			System.out.println("2");
		} else {
			System.out.println("0");
		}

	}
}