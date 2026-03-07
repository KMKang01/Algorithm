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
		String [] lines = br.readLine().split(" ");
		int prev = Integer.parseInt(lines[0]);
		int count = 1;
		for (int i = 1; i < lines.length; i++) {
			int current = Integer.parseInt(lines[i]);
			if(current >= prev) {
				count++;
			}
			prev = current;
		}
		System.out.println(count);

	}
}