import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] ln1 = br.readLine().split(" ");
		int B1 = Integer.parseInt(ln1[0]);
		int B2 = Integer.parseInt(ln1[1]);

		String [] ln2 = br.readLine().split(" ");
		int D1 = Integer.parseInt(ln2[0]);
		int D2 = Integer.parseInt(ln2[1]);

		String [] ln3 = br.readLine().split(" ");
		int J1 = Integer.parseInt(ln3[0]);
		int J2 = Integer.parseInt(ln3[1]);

		int BtoJ = 0;
		while (B1 != J1 || B2 != J2) {
			if (B1 < J1) {
				B1++;
			} else if (B1 > J1) {
				B1--;
			}

			if (B2 < J2) {
				B2++;
			} else if (B2 > J2) {
				B2--;
			}
			BtoJ++;
		}

		int DtoJ = Math.abs(D1 - J1) + Math.abs(D2 - J2);

		System.out.println(BtoJ == DtoJ ? "tie" : (BtoJ < DtoJ ? "bessie" : "daisy"));


	}
}
