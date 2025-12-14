import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		long res = 0;
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		for(int i = 0; i <= K; i++) {
			res += N;
			N *= 10;
		}
		System.out.println(res);
	}
}