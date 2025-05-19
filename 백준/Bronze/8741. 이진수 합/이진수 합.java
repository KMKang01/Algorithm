import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		// 최대 2^1000000 까지 처리 해야 함

		/*
		* 1 -> 0, 1 -> 1
		* 2 -> 0, 1, 10, 11 -> 110
		* 3 -> 0, 1, 10, 11, 100, 101, 110, 111 -> 11100
		* */
		for (int i = 0; i < a; i++) {
			sb.append(1);
		}
		for (int i = 0; i < a - 1; i++) {
			sb.append(0);
		}

		System.out.println(sb.toString());
	}
}