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
			int X = Integer.parseInt(br.readLine());
			String [] query = br.readLine().split(" \\+ ");
			int sum = 0;
			for (String q : query) {
				if(q.equals("!")){
					sum = 10;
					break;
				}
				sum += Integer.parseInt(q);
			}
			if(sum>=10){
				sb.append("!\n");
			} else {
				sb.append(sum + "\n");
			}
		}
		System.out.print(sb);


	}
}