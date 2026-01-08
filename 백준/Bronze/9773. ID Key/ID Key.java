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
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			int sum = 0;
			for(String num : s.split("")) {
				sum += Integer.parseInt(num);
			}
			int last = Integer.parseInt(s.substring(s.length() - 3)) * 10;
			sum += last;
			if(sum < 1000){
				sb.append(sum + 1000).append("\n");
			} else {
				String res = Integer.toString(sum);
				sb.append(res.substring(res.length() - 4)).append("\n");
			}
		}
		System.out.println(sb.toString().trim());
	}
}