import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		String [] line1 = br.readLine().split("");
		String [] line2 = br.readLine().split("");

		int wCount1 = 0;
		int dotCount1 = 0;
		int wCount2 = 0;
		int dotCount2 = 0;
		boolean allMatch = true;

		for (int i = 0; i < N; i++) {
			if(line1[i].equals(line2[i])) {
				if(line1[i].equals("w")) {
					wCount1++;
					wCount2++;
				} else if(line1[i].equals(".")) {
					dotCount1++;
					dotCount2++;
				}
			} else {
				allMatch = false;
				if(line1[i].equals("w")) {
					wCount1++;
					dotCount2++;
				} else if(line1[i].equals(".")) {
					dotCount1++;
					wCount2++;
				}
			}
		}
		if(allMatch) {
			System.out.println("Good");
		} else if(wCount1 == wCount2) {
			System.out.println("Its fine");
		} else if(wCount2 > wCount1) {
			System.out.println("Manners maketh man");
		} else {
			System.out.println("Oryang");
		}

	}
}