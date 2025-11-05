import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		long N = Long.parseLong(br.readLine());
		int F = Integer.parseInt(br.readLine());

		long defaultNumb = N - (N % 100);
		for (int i = 0; i < 100; i++) {
			if ((defaultNumb + i) % F == 0) {
				if (i < 10) {
					sb.append("0").append(i);
				} else {
					sb.append(i);
				}
				break;
			}
		}

		System.out.println(sb.toString().trim());
	}

}