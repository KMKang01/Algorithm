import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		// 1 4 4 1
		// 2 3 3 2
		// 3 2 2 3
		// 4 1 1 4
		// 5 0 0 5
		// 4 1 1 4
		// ...
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			for (int j = 2 * (N - (i+ 1)); j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < N ; i++) {
			for (int j = N - i - 1; j > 0 ; j--) {
				System.out.print("*");
			}
			for (int j = 2 * (i + 1); j > 0 && j <= 2 * (N -1) ; j--) {
				System.out.print(" ");
			}
			for (int j = N - i - 1; j > 0 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}


	}
}