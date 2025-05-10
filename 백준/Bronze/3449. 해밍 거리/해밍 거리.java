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

		int count = 0;
		for (int i = 0; i < N ; i++) {
			String [] str1 = br.readLine().split("");
			String [] str2 = br.readLine().split("");

			for (int j = 0; j < str1.length; j++) {
				if(!str1[j].equals(str2[j])) count++;
			}
			sb.append(String.format("Hamming distance is %d.\n", count));
			count = 0;
		}
		System.out.println(sb.toString().trim());
	}
}

