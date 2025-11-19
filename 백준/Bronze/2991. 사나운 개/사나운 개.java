import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line1 = br.readLine().split(" ");
		int A = Integer.parseInt(line1[0]);
		int B = Integer.parseInt(line1[1]);
		int C = Integer.parseInt(line1[2]);
		int D = Integer.parseInt(line1[3]);

		String [] line2 = br.readLine().split(" ");
		int P = Integer.parseInt(line2[0]);
		int M = Integer.parseInt(line2[1]);
		int N = Integer.parseInt(line2[2]);

		int maxTime = Math.max(P, Math.max(M, N));
		boolean aFlag = false;
		boolean bFlag = false;
		
		int pCount = 0;
		int mCount = 0;
		int nCount = 0;
		for (int i = 0; i <= maxTime ; i++) {
			aFlag = i % (A + B) <= A && i % (A + B) >= 1;
			bFlag = i % (C + D) <= C && i % (C + D) >= 1;

			if (i == P) {
				if(aFlag && bFlag) {
					pCount = 2;
				} else if (aFlag || bFlag) {
					pCount = 1;
				}
			}
			if (i == M) {
				if(aFlag && bFlag) {
					mCount = 2;
				} else if (aFlag || bFlag) {
					mCount = 1;
				}
			}
			if (i == N) {
				if(aFlag && bFlag) {
					nCount = 2;
				} else if (aFlag || bFlag) {
					nCount = 1;
				}
			}
		}

		System.out.println(pCount);
		System.out.println(mCount);
		System.out.println(nCount);
	}
}