import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		String [] arr = br.readLine().split(" ");
		int ys = 0;
		int ms = 0;
		for(int i=0; i<N; i++) {
			int time = Integer.parseInt(arr[i]);
			ys += (time/30 + 1) * 10;
			ms += (time/60 + 1) * 15;
		}
		if(ys < ms) {
			sb.append("Y ").append(ys);
		} else if (ys > ms) {
			sb.append("M ").append(ms);
		} else {
			sb.append("Y M ").append(ys);
		}
		System.out.println(sb);

	}
}