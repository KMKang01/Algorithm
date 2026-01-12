import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line = br.readLine().split("");

		int uIdx = -1;
		int fIdx = -1;

		for (int i = 0; i < line.length; i++) {
			if(uIdx == -1 && line[i].equals("U")) {
				uIdx = i;
			} else if(uIdx != -1 && line[i].equals("F")) {
				fIdx = i;
			}
		}
//		System.out.println(uIdx + " " + fIdx);
		for (int i = 0; i < uIdx ; i++) {
			sb.append("-");
		}
		sb.append("U");
		for (int i = uIdx; i < fIdx - 1 ; i++) {
			sb.append("C");
		}
		sb.append("F");
		for (int i = fIdx; i < line.length - 1; i++) {
			sb.append("-");
		}
		System.out.println(sb.toString());
	}
}