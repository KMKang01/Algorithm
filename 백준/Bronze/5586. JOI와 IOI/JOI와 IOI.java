import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String joi = "JOI";
		String ioi = "IOI";
		int jCount = 0;
		int iCount = 0;

		String [] input = br.readLine().split("");

		for (int i = 0; i < input.length - 2 ; i++) {
			if(input[i].equals("J")) {
				if(sb.append(input[i]).append(input[i+1]).append(input[i+2]).toString().equals(joi)) jCount++;
			} else if(input[i].equals("I")) {
				if(sb.append(input[i]).append(input[i+1]).append(input[i+2]).toString().equals(ioi)) iCount++;
			}
			sb = new StringBuilder();
		}

		System.out.printf("%d\n%d", jCount, iCount);

	}
}