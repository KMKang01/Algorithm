import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("@@@@@");
			}
			System.out.println();
		}
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					System.out.print("@");
				}
				System.out.println();
			}
		}
	}
}


