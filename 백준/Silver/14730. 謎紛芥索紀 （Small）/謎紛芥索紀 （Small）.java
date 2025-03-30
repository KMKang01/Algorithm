import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int count = 0;

		for (int i = 0; i < n; i++) {
			String [] line = br.readLine().split(" ");

			
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);

			count += a * b;
		}

		System.out.println(count);
	}
}


