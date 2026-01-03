import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N  = Integer.parseInt(br.readLine());
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			sum += N % i == 0 ? i : 0;
		}
		System.out.println(sum);
	}
}