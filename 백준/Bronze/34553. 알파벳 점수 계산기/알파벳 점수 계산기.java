import java.io.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line  = br.readLine().split("");
		int score = 0;
		char prev = 0;
		int acc = 0;
		for (int i = 0; i < line.length; i++) {
			if(i==0) {
				prev = line[i].charAt(0);
				score = 1;
				acc = 1;
			} else {
				char ch = line[i].charAt(0);
				if(prev < ch) {
					acc++;
					score += acc;
					prev = ch;
				} else {
					acc = 1;
					score += acc;
					prev = ch;
				}
			}
		}

		System.out.println(score);


	}
}