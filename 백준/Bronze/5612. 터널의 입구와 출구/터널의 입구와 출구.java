import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		// 5612번
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int max = m;
		boolean letterThanZero = false;
		for (int i = 0; i < n; i++) {
			String [] line = br.readLine().split(" ");
			int entered = Integer.parseInt(line[0]);
			int exited = Integer.parseInt(line[1]);
			m += entered - exited;
			if(m < 0){
				letterThanZero = true;
				break;
			}
			max = Math.max(max, m);
		}
		if(letterThanZero){
			System.out.println(0);
		} else {
			System.out.println(max);
		}

	}
}