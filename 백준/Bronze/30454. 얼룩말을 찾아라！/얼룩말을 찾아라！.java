import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int L = Integer.parseInt(line[1]);


		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		int max = -1;
		for (int i = 0; i < N; i++) {
			String pattern = br.readLine().replace("0", " ");
			String [] parts = pattern.split(" ");
			int lnCount = 0;
			for (String part : parts) {
				if(!part.isBlank()) lnCount++;
			}
			list.add(lnCount);
			max = Math.max(max, lnCount);
		}

		for(int num : list) {
			if(num == max) {
				count++;
			}
		}
		System.out.println(max + " " + count);
	}
}