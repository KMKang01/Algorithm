import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		// A^2 = B^2 + N
		// (A + B) * (A - B) = N
		int count = 0;
		int A, B = 0;
		for (B = 1; B <= N; B++) {
			for ( A = B; A <= N; A++) {
				if((A+B)*(A-B) == N) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
