import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] str1 = br.readLine().split(":");
		String[] str2 = br.readLine().split(":");

		int h = Integer.parseInt(str2[0]) - Integer.parseInt(str1[0]);
		int m = Integer.parseInt(str2[1]) - Integer.parseInt(str1[1]);
		int s = Integer.parseInt(str2[2]) - Integer.parseInt(str1[2]);
		if(s < 0) {
			s += 60;
			m--;
		}
		if (m < 0) {
			m += 60;
			h--;
		}
		if (h < 0) {
			h += 24;
		}
		if(h == 0 && m == 0 && s==0) {
			System.out.println("24:00:00");
		} else {
			System.out.printf("%02d:%02d:%02d", h, m, s);
		}

	}
}