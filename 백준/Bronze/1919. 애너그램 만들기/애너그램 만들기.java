import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int [][] cnt = new int[2][26];

		String [] word1 = br.readLine().split("");
		String [] word2 = br.readLine().split("");

		for (int i = 0; i < word1.length; i++) {
			cnt[0][word1[i].charAt(0) - 'a']++;
		}
		for (int i = 0; i < word2.length; i++) {
			cnt[1][word2[i].charAt(0) - 'a']++;
		}

		int count = 0;
		for (int i = 0; i < 26; i++) {
			count += Math.abs(cnt[0][i] - cnt[1][i]);
		}

		System.out.println(count);
	}
}