import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] line = br.readLine().split("");

		for (int i = 0; i < line.length; i++) {
			int now = line[i].charAt(0);
			if(now >= 65 && now <= 90) {
				now += 13;
				if(now > 90) now -= 26;
			} else if(now >= 97 && now <= 122) {
				now += 13;
				if(now > 122) now -= 26;
			}
			sb.append((char)now);
		}

		System.out.print(sb.toString());
	}
}

