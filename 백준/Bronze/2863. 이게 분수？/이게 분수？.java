import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] ab = br.readLine().split(" ");
		int a = Integer.parseInt(ab[0]);
		int b = Integer.parseInt(ab[1]);
		String [] cd = br.readLine().split(" ");
		int c = Integer.parseInt(cd[0]);
		int d = Integer.parseInt(cd[1]);

		double r0 = (double) a / c + (double) b / d;
		double r1 = (double) c / d + (double) a / b;
		double r2 = (double) d / b + (double) c / a;
		double r3 = (double) b / a + (double) d / c;

		double max = Math.max(Math.max(r0, r1), Math.max(r2, r3));
		if(max == r0) {
			System.out.println("0");
		} else if(max == r1) {
			System.out.println("1");
		} else if(max == r2) {
			System.out.println("2");
		} else {
			System.out.println("3");
		}


	}
}
