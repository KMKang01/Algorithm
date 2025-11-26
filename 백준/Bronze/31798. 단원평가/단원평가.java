import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line = br.readLine().split(" ");
		int a = Integer.parseInt(line[0]);
		int b = Integer.parseInt(line[1]);
		int c = Integer.parseInt(line[2]);

		if(a == 0) {
			a = c * c - b;
			System.out.println(a);
		} else if(b == 0) {
			b = c * c -a;
			System.out.println(b);
		} else {
			c = (int)Math.sqrt(a + b);
			System.out.println(c);
		}

	}
}