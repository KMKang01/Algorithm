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

		for (int i = 0; i < a; i++) {
			String[] s = br.readLine().split("");

			int[] counts = new int[26];

			for (String c : s) {
				if (c.equals(" ")) continue;
				counts[c.charAt(0) - 'a']++;
			}
			int max = -1;
			int maxIdx = 0;
			int sameCount = 0;
			for (int j = 0; j < counts.length; j++) {
				if (counts[j] > max) {
					max = counts[j];
					maxIdx = j;
					sameCount = 1;
				} else if(counts[j] == max) {
					sameCount++;
				}
			}
			if(sameCount > 1){
				sb.append("?\n");
			}else {
				sb.append(Character.toChars(maxIdx+'a')).append("\n");
			}

		}
		System.out.println(sb.toString().trim());
	}
}