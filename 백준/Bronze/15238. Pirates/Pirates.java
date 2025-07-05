import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int nums = Integer.parseInt(br.readLine());
		String [] input = br.readLine().split("");
		int [] alphabet = new int[26];

		for (int i = 0; i < nums; i++) {
			int idx = input[i].charAt(0) - 'a';
			alphabet[idx]++;
		}

		int max = Integer.MIN_VALUE;
		int idx = 0;
		for (int i = 0; i < alphabet.length; i++) {
			if(alphabet[i] > max) {
				max = alphabet[i];
				idx = i;
			}
		}
		System.out.println((char) (idx + 'a') + " " + max);
	}
}


